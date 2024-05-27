package org.example.housekg.models.dto;

import java.time.LocalDateTime;

public record ApiErrorDto(
        String path,
        String message,
        int statusCode,
        LocalDateTime dateTime
) {
}
