package org.example.housekg.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.housekg.exceptions.CustomValidationException;
import org.example.housekg.exceptions.ObjectNotFoundException;
import org.example.housekg.mapper.BaseMapper;
import org.example.housekg.mapper.NumberOfRoomMapper;
import org.example.housekg.models.dto.BaseDto;
import org.example.housekg.models.dto.CustomValidationErrorDto;
import org.example.housekg.models.dto.NumberOfRoomDto;
import org.example.housekg.models.entity.NumberOfRoom;
import org.example.housekg.repository.NumberOfRoomRepository;
import org.example.housekg.service.NumberOfRoomService;
import org.example.housekg.validator.CustomValidator;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class NumberOfRoomServiceImpl implements NumberOfRoomService {

    private final NumberOfRoomRepository numberOfRoomRepository;
    private final CustomValidator<NumberOfRoomDto> numberOfRoomDtoValidator;

    @Override
    public List<NumberOfRoomDto> findAllNumberOfRooms() {
        return numberOfRoomRepository.findAll().stream()
                .map(NumberOfRoomMapper.INSTANCE::toNumberOfRoomDto)
                .toList();
    }

    @Override
    public String saveNumberOfRoom(NumberOfRoomDto numberOfRoomDto) {
        List<CustomValidationErrorDto> fieldErrors = numberOfRoomDtoValidator.validate(numberOfRoomDto);
        if (!fieldErrors.isEmpty()) throw new CustomValidationException("Fields exception", fieldErrors);

        numberOfRoomRepository.save(NumberOfRoomMapper.INSTANCE.toNumberOfRoom(numberOfRoomDto));
        return "Number of room has been successfully saved";
    }

    @Override
    public NumberOfRoomDto findNumberOfRoomById(Long id) {
        return NumberOfRoomMapper.INSTANCE.toNumberOfRoomDto(numberOfRoomRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Number of rooms was not found")));
    }

    @Override
    public String deleteNumberOfRoom(Long id) {
        NumberOfRoom numberOfRoom = numberOfRoomRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Number of rooms was not found"));

        numberOfRoomRepository.delete(numberOfRoom);
        return "Number of room has been successfully deleted";
    }
}
