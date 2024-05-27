package org.example.housekg.models.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

public record PriceDto(
        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        Long id,
        @NotNull(message = "Price can not be null!")
        Double price,
        byte priceFor // 1 - м2, 0 за все
) {

}
