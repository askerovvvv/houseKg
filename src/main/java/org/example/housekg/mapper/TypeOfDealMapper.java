package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.TypeOfDeal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeOfDealMapper extends BaseMapper<TypeOfDeal, BaseDto>{
    @Override
    default BaseDto toBaseDto(TypeOfDeal baseEntity) {
        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
    }

    @Override
    default TypeOfDeal toBaseEntity(BaseDto baseDto) {
        return TypeOfDeal.builder()
                .optionName(baseDto.optionName())
                .build();
    }
}
