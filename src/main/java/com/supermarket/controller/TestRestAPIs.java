package com.supermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.model.Admin;
import com.supermarket.security.services.AdminService;
import com.supermarket.security.services.LandingService;

@CrossOrigin(origins = "*")
@RestController
public class TestRestAPIs {

	@Autowired
	AdminService service;
	
	@Autowired
	LandingService service1;
	
	@GetMapping("/api/landing/products")
	public ResponseEntity<Iterable<Admin>> findAllproduct(){
		System.out.println("In find all");
		
		Iterable<Admin> products=service1.findAll();
		
		return ResponseEntity.ok(products);
	}
	
	@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<Iterable<Admin>> findAlls(){
		System.out.println("In find all");
		
		Iterable<Admin> products=service.findAll();
		
		return ResponseEntity.ok(products);
	}
//	public String userAccess() {
//		return ">>> User Contents!";
//	}
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Iterable<Admin>> findAll(){
		System.out.println("In find all");
		
		Iterable<Admin> admins=service.findAll();
		
		return ResponseEntity.ok(admins);
	}
//	public String adminAccess() {
//	return ">>> Admin Contents";
//}
	

}
