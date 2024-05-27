package org.example.housekg.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.example.housekg.models.dto.ApiErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<ApiErrorDto> handleException(ObjectNotFoundException exception, HttpServletRequest request) {
        ApiErrorDto apiError = new ApiErrorDto(
                request.getRequestURI(),
                exception.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                LocalDateTime.now()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
    };

    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<?> exceptionHandler(CustomValidationException exception, HttpServletRequest request) {
        Map<String, Object> apiError = new HashMap<>();
        apiError.put("path", request.getRequestURI());
        apiError.put("message", exception.getMessage());
        apiError.put("statusCode", HttpStatus.BAD_REQUEST.value());
        apiError.put("dateTime", LocalDateTime.now());
        apiError.put("errors", exception.getFieldsError());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
    }
}
