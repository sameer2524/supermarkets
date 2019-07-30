package com.supermarket.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.model.Admin;
import com.supermarket.security.services.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/test/user")
public class ProductController {
	@Autowired(required = true)
    ProductService service;
	
	@GetMapping("/products")
	public List<Admin> getAllProducts() {
		System.out.println("Get all Products...");

		List<Admin> products = new ArrayList<>();
		service.findAlls().forEach(products::add);

		return products;
	}
	@GetMapping(value = "/products/name/{productname}")
	public List<Admin> findByProductname(@PathVariable String productname) {

		List<Admin> admins =  new ArrayList<>();
		service.findByProductname(productname).forEach(admins::add);;
		
		return admins;
	}
	
	 @GetMapping("/product/{id}")
	    public Optional<Admin> getProductById(@PathVariable(value = "id") Long id) {
	        return service.findById(id);
	    }
	

}
