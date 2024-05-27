package org.example.housekg.controller;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Series;
import org.example.housekg.models.entity.State;
import org.example.housekg.repository.SeriesRepository;
import org.example.housekg.repository.StateRepository;
import org.example.housekg.service.impl.SeriesServiceImpl;
import org.example.housekg.service.impl.StateServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/state")
public class StateController extends BaseController<State, BaseDto, StateRepository, StateServiceImpl>{

    protected StateController(StateServiceImpl service) {
        super(service);
    }
}
