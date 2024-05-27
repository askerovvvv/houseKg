package org.example.housekg.controller;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.TypeOfDeal;
import org.example.housekg.repository.TypeOfDealRepository;
import org.example.housekg.service.impl.TypeOfDealServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/type/of/deal")
public class TypeOfDealController extends BaseController<TypeOfDeal, BaseDto, TypeOfDealRepository, TypeOfDealServiceImpl>{

    protected TypeOfDealController(TypeOfDealServiceImpl service) {
        super(service);
    }
}
