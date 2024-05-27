package org.example.housekg.service.impl;

import org.example.housekg.mapper.HeatingMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Heating;
import org.example.housekg.repository.HeatingRepository;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

@Service
public class HeatingServiceImpl extends AbstractBaseServiceImpl<Heating, BaseDto, HeatingRepository> {

    public HeatingServiceImpl(HeatingRepository repository, HeatingMapper mapper, CustomValidator<BaseDto> validator) {
        super(repository, mapper, validator);
    }

}
