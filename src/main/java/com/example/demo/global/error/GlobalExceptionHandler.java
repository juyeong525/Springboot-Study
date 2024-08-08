package com.example.demo.global.error;

import com.example.demo.global.error.exception.CustomException;
import com.example.demo.global.error.exception.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handlingCustomException(CustomException e) {
        ErrorCode code = e.getErrorCode();
        return new ResponseEntity<>(
                new ErrorResponse(code.getStatus(), code.getMessage()),
                HttpStatus.valueOf(code.getStatus())
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorResponse> validatorExceptionHandler(MethodArgumentNotValidException e) {
        return new ResponseEntity<>(
                new ErrorResponse(
                        400,
                        "COMMON-400"
                ),
                HttpStatus.BAD_REQUEST);
    }
}
