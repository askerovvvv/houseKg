package org.example.housekg.service;

import org.example.housekg.models.dto.AdvertisementDto;
import org.example.housekg.models.entity.Advertisement;
import org.example.housekg.repository.AdvertisementRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AdvertisementService {

    List<AdvertisementDto> findAll(int pageNumber, int pageSize);
    String save(AdvertisementDto dto);
}
