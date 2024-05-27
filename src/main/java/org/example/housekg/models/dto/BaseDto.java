package org.example.housekg.models.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public record BaseDto(
        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        Long id,
        String optionName
) {

}
