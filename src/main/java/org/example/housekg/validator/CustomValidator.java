package org.example.housekg.validator;

import org.example.housekg.models.dto.CustomValidationErrorDto;

import java.util.List;

public interface CustomValidator<T> {

    static <T> CustomValidator<T> getInstance() {
        return new CustomValidatorImpl<>();
    }

    List<CustomValidationErrorDto> validate(T objectToValidate);

}
