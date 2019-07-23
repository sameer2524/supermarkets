package com.supermarket.security.services;

import java.util.Optional;

import com.supermarket.model.Admin;

public interface AdminService{
	
	Iterable<Admin> findAll();
	
	Optional<Admin> findById(long id);
	
	Admin save(Admin admin);
	
	void deleteById(long id);
	
	void deleteAll();
}
