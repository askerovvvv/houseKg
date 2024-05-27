package org.example.housekg.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.housekg.exceptions.CustomValidationException;
import org.example.housekg.exceptions.ObjectNotFoundException;
import org.example.housekg.mapper.BaseMapper;
import org.example.housekg.mapper.PossibilityOfExchangeMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.dto.CustomValidationErrorDto;
import org.example.housekg.models.entity.Heating;
import org.example.housekg.models.entity.PossibilityOfExchange;
import org.example.housekg.repository.HeatingRepository;
import org.example.housekg.repository.PossibilityOfExchangeRepository;
import org.example.housekg.service.BaseService;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PossibilityOfExchangeServiceImpl extends AbstractBaseServiceImpl<PossibilityOfExchange, BaseDto, PossibilityOfExchangeRepository> {

    public PossibilityOfExchangeServiceImpl(PossibilityOfExchangeRepository repository, PossibilityOfExchangeMapper mapper, CustomValidator<BaseDto> validator) {
        super(repository, mapper, validator);
    }
}
