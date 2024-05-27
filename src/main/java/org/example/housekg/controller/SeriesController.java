package org.example.housekg.controller;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Series;
import org.example.housekg.repository.SeriesRepository;
import org.example.housekg.service.impl.SeriesServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/series")
public class SeriesController extends BaseController<Series, BaseDto, SeriesRepository, SeriesServiceImpl>{

    protected SeriesController(SeriesServiceImpl service) {
        super(service);
    }
}
