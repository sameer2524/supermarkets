package com.supermarket.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.model.Admin;
import com.supermarket.repository.LandingRepository;

@Service
public class LandingServiceImpl implements LandingService {
	@Autowired
	LandingRepository landRepository;
	
	@Override
	public Iterable<Admin> findAll(){
		return landRepository.findAll();
	}

}
