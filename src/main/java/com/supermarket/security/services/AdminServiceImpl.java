package com.supermarket.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.model.Admin;
import com.supermarket.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public Iterable<Admin> findAll(){
		return adminRepository.findAll();
	}

	@Override
	public Admin save(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public void deleteAll() {
		adminRepository.deleteAll();
	}

	@Override
	public void deleteById(long id) {
		adminRepository.deleteById(id);
	}

	@Override
	public Optional<Admin> findById(long id) {
		return adminRepository.findById(id);
	}
}