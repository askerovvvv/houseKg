package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Series;
import org.example.housekg.models.entity.State;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StateMapper extends BaseMapper<State, BaseDto>{
    @Override
    default BaseDto toBaseDto(State baseEntity) {
        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
    }

    @Override
    default State toBaseEntity(BaseDto baseDto) {
        return State.builder()
                .optionName(baseDto.optionName())
                .build();
    }
}
