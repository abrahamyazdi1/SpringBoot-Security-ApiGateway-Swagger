package com.taba.security.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class jwtValidationResponse {
    private boolean status;
    private UserDetails userDetails;
}
