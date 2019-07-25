package com.supermarket.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.model.Admin;
import com.supermarket.repository.ProductRepository;

public interface ProductService {

	
	Iterable<Admin> findAlls();
}
