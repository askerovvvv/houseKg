package org.example.housekg.mapper;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.dto.NumberOfRoomDto;
import org.example.housekg.models.entity.BaseEntity;
import org.example.housekg.models.entity.NumberOfRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface NumberOfRoomMapper {
    NumberOfRoomMapper INSTANCE = Mappers.getMapper(NumberOfRoomMapper.class);

    default NumberOfRoomDto toNumberOfRoomDto(NumberOfRoom numberOfRoom) {
        return new NumberOfRoomDto(numberOfRoom.getId(), numberOfRoom.getNumberOfRooms());
    }

    default NumberOfRoom toNumberOfRoom(NumberOfRoomDto numberOfRoomDto) {
        return NumberOfRoom.builder()
                .id(numberOfRoomDto.id())
                .numberOfRooms(numberOfRoomDto.numberOfRooms())
                .build();
    }
}
