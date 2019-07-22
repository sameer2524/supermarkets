package com.supermarket.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


import com.supermarket.model.user;

public interface UserRepository extends JpaRepositoryImplementation<user, Long> {
	
	 Optional<user> findByUsername(String username);
	    Boolean existsByUsername(String username);
	    Boolean existsByEmail(String email);
}
