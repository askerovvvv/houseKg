package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.ResidentialComplex;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface ResidentialComplexMapper extends BaseMapper<ResidentialComplex, BaseDto>{
    @Override
    default BaseDto toBaseDto(ResidentialComplex baseEntity) {
        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
    }

    @Override
    default ResidentialComplex toBaseEntity(BaseDto baseDto) {
        return ResidentialComplex.builder()
                .optionName(baseDto.optionName())
                .build();
    }
}
