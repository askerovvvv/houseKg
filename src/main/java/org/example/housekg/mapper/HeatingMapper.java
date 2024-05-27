package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Heating;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HeatingMapper extends BaseMapper<Heating, BaseDto>{
    @Override
    default BaseDto toBaseDto(Heating baseEntity) {
        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
    }

    @Override
    default Heating toBaseEntity(BaseDto baseDto) {
        return Heating.builder()
                .optionName(baseDto.optionName())
                .build();
    }
}
