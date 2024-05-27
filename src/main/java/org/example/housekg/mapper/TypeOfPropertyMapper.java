package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.TypeOfDeal;
import org.example.housekg.models.entity.TypeOfProperty;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeOfPropertyMapper extends BaseMapper<TypeOfProperty, BaseDto>{
    @Override
    default BaseDto toBaseDto(TypeOfProperty baseEntity) {
        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
    }

    @Override
    default TypeOfProperty toBaseEntity(BaseDto baseDto) {
        return TypeOfProperty.builder()
                .optionName(baseDto.optionName())
                .build();
    }
}
