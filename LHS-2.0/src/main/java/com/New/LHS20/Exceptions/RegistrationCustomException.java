package com.New.LHS20.Exceptions;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationCustomException extends RuntimeException {
	private String errorCode;
	private String errorMessage;
}
