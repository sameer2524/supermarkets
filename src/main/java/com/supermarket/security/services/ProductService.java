package com.supermarket.security.services;


import java.util.Optional;

import com.supermarket.model.Admin;

public interface ProductService {

	Iterable<Admin> findAlls();
	Optional<Admin> findById(Long id);
}
