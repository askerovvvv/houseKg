package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.State;
import org.example.housekg.models.entity.TypeOfBuilding;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeOfBuildingMapper extends BaseMapper<TypeOfBuilding, BaseDto>{
    @Override
    default BaseDto toBaseDto(TypeOfBuilding baseEntity) {
        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
    }

    @Override
    default TypeOfBuilding toBaseEntity(BaseDto baseDto) {
        return TypeOfBuilding.builder()
                .optionName(baseDto.optionName())
                .build();
    }
}
