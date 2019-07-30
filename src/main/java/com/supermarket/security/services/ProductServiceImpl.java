package com.supermarket.security.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.model.Admin;
import com.supermarket.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository repository;

	@Override
	public Iterable<Admin> findAlls() {
		return repository.findAll();
	}

	@Override
	public Optional<Admin> findById(Long id) {
		return repository.findById(id);
	}
	
	@Override
	public List<Admin> findByProductname(String productname) {
		return repository.findByProductname(productname);
	}
	
}
