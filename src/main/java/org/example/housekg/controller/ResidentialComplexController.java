package org.example.housekg.controller;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.ResidentialComplex;
import org.example.housekg.repository.ResidentialComplexRepository;
import org.example.housekg.service.impl.ResidentialComplexServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/residential/complex")
public class ResidentialComplexController extends BaseController<ResidentialComplex, BaseDto, ResidentialComplexRepository, ResidentialComplexServiceImpl>{

    protected ResidentialComplexController(ResidentialComplexServiceImpl service) {
        super(service);
    }
}
