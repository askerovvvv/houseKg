package org.example.housekg.controller;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.State;
import org.example.housekg.models.entity.TypeOfBuilding;
import org.example.housekg.repository.StateRepository;
import org.example.housekg.repository.TypeOfBuildingRepository;
import org.example.housekg.service.impl.StateServiceImpl;
import org.example.housekg.service.impl.TypeOfBuildingServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/type/of/building")
public class TypeOfBuildingController extends BaseController<TypeOfBuilding, BaseDto, TypeOfBuildingRepository, TypeOfBuildingServiceImpl>{

    protected TypeOfBuildingController(TypeOfBuildingServiceImpl service) {
        super(service);
    }
}
