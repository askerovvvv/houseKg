package org.example.housekg.service.impl;

import org.example.housekg.mapper.StateMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.State;
import org.example.housekg.repository.StateRepository;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

@Service
public class StateServiceImpl extends AbstractBaseServiceImpl<State, BaseDto, StateRepository> {

    public StateServiceImpl(StateRepository repository, StateMapper mapper, CustomValidator<BaseDto> validator) {
        super(repository, mapper, validator);
    }
}