package com.supermarket.security.services;


import java.util.List;
import java.util.Optional;

import com.supermarket.model.Admin;

public interface ProductService {

	Iterable<Admin> findAlls();
	List<Admin> findByProductname(String productname);
	Optional<Admin> findById(Long id);
}
