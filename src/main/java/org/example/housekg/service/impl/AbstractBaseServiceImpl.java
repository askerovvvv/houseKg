package org.example.housekg.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.housekg.exceptions.CustomValidationException;
import org.example.housekg.exceptions.ObjectNotFoundException;
import org.example.housekg.mapper.BaseMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.dto.CustomValidationErrorDto;
import org.example.housekg.service.BaseService;
import org.example.housekg.validator.CustomValidator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RequiredArgsConstructor
public class AbstractBaseServiceImpl<T, D, R extends JpaRepository<T, Long>> implements BaseService<T, D, R> {

    protected final R repository;
    protected final BaseMapper<T, D> mapper;
    protected final CustomValidator<D> validator;
    @Override
    public List<D> findAll() {
        return repository.findAll().stream()
                .map(mapper::toBaseDto)
                .toList();
    }

    @Override
    public String save(D dto) {
        List<CustomValidationErrorDto> fieldErrors = validator.validate(dto);
        if (!fieldErrors.isEmpty()) throw new CustomValidationException("Fields exception", fieldErrors);
        repository.save(mapper.toBaseEntity(dto));
        return "Entity has been successfully saved";
    }

    @Override
    public D findById(Long id) {
        return mapper.toBaseDto(repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Entity was not found")));
    }

    @Override
    public T findByIdAndReturnEntity(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Entity was not found"));
    }

    @Override
    public String deleteById(Long id) {
        T entity = repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Entity was not found"));
        repository.delete(entity);
        return "Entity has been successfully deleted";
    }
}
