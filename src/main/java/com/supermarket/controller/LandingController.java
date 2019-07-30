package com.supermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.model.Admin;
import com.supermarket.security.services.LandingService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/landing/products")
public class LandingController {
	@Autowired
	LandingService service1;
	
	@GetMapping("/")
	public ResponseEntity<Iterable<Admin>> findAllproduct(){
		System.out.println("In find all");
		
		Iterable<Admin> products=service1.findAll();
		
		return ResponseEntity.ok(products);
	}
}
