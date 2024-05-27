package org.example.housekg.service.impl;

import org.example.housekg.mapper.TypeOfPropertyMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.TypeOfProperty;
import org.example.housekg.repository.TypeOfPropertyRepository;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

@Service
public class TypeOfPropertyServiceImpl extends AbstractBaseServiceImpl<TypeOfProperty, BaseDto, TypeOfPropertyRepository> {

    public TypeOfPropertyServiceImpl(TypeOfPropertyRepository repository, TypeOfPropertyMapper mapper, CustomValidator<BaseDto> validator) {
        super(repository, mapper, validator);
    }
}