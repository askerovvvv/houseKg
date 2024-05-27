package org.example.housekg.service.impl;

import org.example.housekg.mapper.TypeOfDealMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.TypeOfDeal;
import org.example.housekg.repository.TypeOfDealRepository;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

@Service
public class TypeOfDealServiceImpl extends AbstractBaseServiceImpl<TypeOfDeal, BaseDto, TypeOfDealRepository> {

    public TypeOfDealServiceImpl(TypeOfDealRepository repository, TypeOfDealMapper mapper, CustomValidator<BaseDto> validator) {
        super(repository, mapper, validator);
    }
}