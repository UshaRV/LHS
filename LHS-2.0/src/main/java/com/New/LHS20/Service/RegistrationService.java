package com.New.LHS20.Service;

import com.New.LHS20.Dao.RegistrationRepository;
import com.New.LHS20.Dto.RegistrationDto;
import com.New.LHS20.Entity.RegistrationForm;
import com.New.LHS20.Exceptions.RegistrationCustomException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

	// Set<RegistrationForm> set = new HashSet<>();

	@Autowired
	private RegistrationRepository repo;

	public String addUser(RegistrationDto dto) {

		RegistrationForm regform = new RegistrationForm();

		ModelMapper modelmapper = new ModelMapper();
		modelmapper.map(dto, regform);

		if (dto == null) {
			throw new RuntimeException("null found in registration plss check");
		}

		else if (repo.existsByUsername(dto.getUsername())) {
			throw new RegistrationCustomException();
		} else {

			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

			regform.setPassword(bCryptPasswordEncoder.encode(regform.getPassword()));
			repo.save(regform);

			return "saved";

		}
	}

}
