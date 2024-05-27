package org.example.housekg.models.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

public record NumberOfRoomDto(
        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        Long id,
        @NotNull(message = "NumberOfRooms can not be null!")
        Integer numberOfRooms
) {

}
