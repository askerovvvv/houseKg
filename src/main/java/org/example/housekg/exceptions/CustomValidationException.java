package org.example.housekg.exceptions;

import lombok.Getter;
import org.example.housekg.models.dto.CustomValidationErrorDto;

import java.util.List;

@Getter
public class CustomValidationException extends RuntimeException {

    private final List<CustomValidationErrorDto> fieldsError;

    public CustomValidationException(String message, List<CustomValidationErrorDto> fieldsError) {
        super(message);
        this.fieldsError = fieldsError;
    }
}
