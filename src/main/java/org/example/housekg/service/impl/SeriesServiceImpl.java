package org.example.housekg.service.impl;

import org.example.housekg.mapper.SeriesMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Series;
import org.example.housekg.repository.SeriesRepository;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

@Service
public class SeriesServiceImpl extends AbstractBaseServiceImpl<Series, BaseDto, SeriesRepository> {

    public SeriesServiceImpl(SeriesRepository repository, SeriesMapper mapper, CustomValidator<BaseDto> validator) {
        super(repository, mapper, validator);
    }
}