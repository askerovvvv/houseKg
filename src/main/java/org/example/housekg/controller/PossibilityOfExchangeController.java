package org.example.housekg.controller;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.PossibilityOfExchange;
import org.example.housekg.repository.PossibilityOfExchangeRepository;
import org.example.housekg.service.impl.PossibilityOfExchangeServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/possibility/of/exchange")
public class PossibilityOfExchangeController extends BaseController<PossibilityOfExchange, BaseDto, PossibilityOfExchangeRepository, PossibilityOfExchangeServiceImpl>{

    protected PossibilityOfExchangeController(PossibilityOfExchangeServiceImpl service) {
        super(service);
    }
}
