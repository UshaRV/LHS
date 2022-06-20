package com.New.LHS20.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(RegistrationCustomException.class)
	public ResponseEntity<String> customException() {
		return new ResponseEntity<String>("\"Username Already Exists please enter different One\"",
				HttpStatus.BAD_REQUEST);

	}
}
