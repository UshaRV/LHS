package com.New.LHS20.Security;

import com.New.LHS20.Dao.RegistrationRepository;
import com.New.LHS20.Entity.RegistrationForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetails implements UserDetailsService {
	@Autowired
	private RegistrationRepository regrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		RegistrationForm regform = regrepo.findByUsername(username);

		if (regform == null) {
			throw new RuntimeException("Exception raising userdetails");
		}
		return new UserDetailImp(regform);

	}

}
