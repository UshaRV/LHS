package com.New.LHS20.Dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class RegistrationDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@NotNull(message = "First name should be there")
	private String firstName;

	private String lastName;

	@Email(message = "invalid email address")
	private String email;

	private long phoneNo;

	private String dob;

	private String gender;

	@NotEmpty(message = "username should be there")
	private String username;

	@NotEmpty

	@Size(min = 8, message = "minimum 8 characters required")
	private String password;

}
