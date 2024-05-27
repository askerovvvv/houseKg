package org.example.housekg.service.impl;

import org.example.housekg.mapper.TypeOfBuildingMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.TypeOfBuilding;
import org.example.housekg.repository.TypeOfBuildingRepository;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

@Service
public class TypeOfBuildingServiceImpl extends AbstractBaseServiceImpl<TypeOfBuilding, BaseDto, TypeOfBuildingRepository> {

    public TypeOfBuildingServiceImpl(TypeOfBuildingRepository repository, TypeOfBuildingMapper mapper, CustomValidator<BaseDto> validator) {
        super(repository, mapper, validator);
    }
}