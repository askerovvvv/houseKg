package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.entity.Heating;
import org.example.housekg.models.entity.PossibilityOfExchange;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PossibilityOfExchangeMapper extends BaseMapper<PossibilityOfExchange, BaseDto>{

    @Override
    default BaseDto toBaseDto(PossibilityOfExchange baseEntity) {
        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
    }

    @Override
    default PossibilityOfExchange toBaseEntity(BaseDto baseDto) {
        return PossibilityOfExchange.builder()
                .optionName(baseDto.optionName())
                .build();
    }

}
