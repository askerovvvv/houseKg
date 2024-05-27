package org.example.housekg.service.impl;

import org.example.housekg.mapper.ResidentialComplexMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.ResidentialComplex;
import org.example.housekg.repository.ResidentialComplexRepository;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

@Service
public class ResidentialComplexServiceImpl extends AbstractBaseServiceImpl<ResidentialComplex, BaseDto, ResidentialComplexRepository> {

    public ResidentialComplexServiceImpl(ResidentialComplexRepository repository, ResidentialComplexMapper mapper, CustomValidator<BaseDto> validator) {
        super(repository, mapper, validator);
    }
}