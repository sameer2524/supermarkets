package com.supermarket.security.services;

import com.supermarket.model.Admin;

public interface LandingService {
	Iterable<Admin> findAll();
}
