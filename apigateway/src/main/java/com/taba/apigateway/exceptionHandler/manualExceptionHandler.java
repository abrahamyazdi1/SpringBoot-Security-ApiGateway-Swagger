package com.taba.apigateway.exceptionHandler;

import com.taba.apigateway.dto.customErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class manualExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(athenticateException.class)
    public ResponseEntity<customErrorResponseDto> handleException(athenticateException e) {
        String errors = e.getMessage();

        return new ResponseEntity<>(new customErrorResponseDto(errors,true,""),HttpStatus.BAD_REQUEST);
    }
}
