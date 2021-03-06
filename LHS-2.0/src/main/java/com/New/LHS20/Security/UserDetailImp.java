package com.New.LHS20.Security;

import java.util.Collection;
import java.util.Collections;

import com.New.LHS20.Entity.RegistrationForm;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailImp implements UserDetails {

	private static final long serialVersionUID = 1L;

	RegistrationForm regform;

	public UserDetailImp(RegistrationForm regform) {
		super();
		this.regform = regform;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
// TODO Auto-generated method stub
		return regform.getPassword();
	}

	@Override
	public String getUsername() {
// TODO Auto-generated method stub
		return regform.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
// TODO Auto-generated method stub
		return true;
	}

}