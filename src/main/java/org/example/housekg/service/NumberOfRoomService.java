package org.example.housekg.service;

import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.dto.NumberOfRoomDto;

import java.util.List;

public interface NumberOfRoomService {
    List<NumberOfRoomDto> findAllNumberOfRooms();
    String saveNumberOfRoom(NumberOfRoomDto numberOfRoomDto);
    NumberOfRoomDto findNumberOfRoomById(Long id);
    String deleteNumberOfRoom(Long id);
}
