package com.New.LHS20.Controller;

import javax.validation.Valid;

import com.New.LHS20.Dto.RegistrationDto;
import com.New.LHS20.Service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class RegistrationController {

	@Autowired
	private RegistrationService reg;
	@Autowired
	private RegistrationDto dto;

	@PostMapping("/register")
	public String add(@RequestBody @Valid RegistrationDto dto) {
		return this.reg.addUser(dto);

	}

}
