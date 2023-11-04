package com.taba.apigateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class customErrorResponseDto {
    private String message;
    private boolean isError;
    private String Data;

}
