package com.taba.apigateway.dto;

import com.taba.apigateway.model.UserDetailsImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class jwtValidationResponse {
    private boolean status;
    private UserDetailsImpl userDetails;

}

