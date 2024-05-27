package org.example.housekg.controller;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.TypeOfProperty;
import org.example.housekg.repository.TypeOfPropertyRepository;
import org.example.housekg.service.impl.TypeOfPropertyServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/type/of/property")
public class TypeOfPropertyController extends BaseController<TypeOfProperty, BaseDto, TypeOfPropertyRepository, TypeOfPropertyServiceImpl>{

    protected TypeOfPropertyController(TypeOfPropertyServiceImpl service) {
        super(service);
    }
}
