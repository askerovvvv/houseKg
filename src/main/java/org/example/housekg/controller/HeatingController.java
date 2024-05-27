package org.example.housekg.controller;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Heating;
import org.example.housekg.models.entity.ResidentialComplex;
import org.example.housekg.repository.HeatingRepository;
import org.example.housekg.repository.ResidentialComplexRepository;
import org.example.housekg.service.impl.HeatingServiceImpl;
import org.example.housekg.service.impl.ResidentialComplexServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/heating")
public class HeatingController extends BaseController<Heating, BaseDto, HeatingRepository, HeatingServiceImpl>{

    protected HeatingController(HeatingServiceImpl service) {
        super(service);
    }
}
