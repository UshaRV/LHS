package com.New.LHS20.Dao;

import com.New.LHS20.Entity.RegistrationForm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationForm, String> {

	boolean existsByUsername(String username);

	RegistrationForm findByUsername(String username);

}
