package org.example.housekg.models.dto;

public record CustomValidationErrorDto(
        String field,
        String message
) {
}
