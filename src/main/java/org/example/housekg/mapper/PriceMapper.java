//package org.example.housekg.mapper;
//
//import org.example.housekg.models.dto.BaseDto;
//import org.example.housekg.models.entity.Heating;
//import org.example.housekg.models.entity.Price;
//import org.mapstruct.Mapper;
//
//@Mapper(componentModel = "spring")
//public interface PriceMapper extends BaseMapper<Price, BaseDto>{
//    @Override
//    default BaseDto toBaseDto(Price baseEntity) {
//        return new BaseDto(baseEntity.getId(), baseEntity.getOptionName());
//    }
//
//    @Override
//    default Price toBaseEntity(BaseDto baseDto) {
//        return Price.builder()
//                .optionName(baseDto.optionName())
//                .price()
//                .build();
//    }
//}
