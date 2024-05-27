package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Heating;
import org.example.housekg.models.entity.Series;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeriesMapper extends BaseMapper<Series, BaseDto>{
    @Override
    default BaseDto toBaseDto(Series baseEntity) {
        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
    }

    @Override
    default Series toBaseEntity(BaseDto baseDto) {
        return Series.builder()
                .optionName(baseDto.optionName())
                .build();
    }
}
