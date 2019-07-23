package com.supermarket.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.model.Admin;
import com.supermarket.repository.AdminRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class AdminController {
	@Autowired
	AdminRepository repository;
	
	@GetMapping("/admin/products")
	public List<Admin> getAllAdmins() {
		System.out.println("Get all Products...");

		List<Admin> admins = new ArrayList<>();
		repository.findAll().forEach(admins::add);

		return admins;
	}
	
	@PostMapping(value = "/admin/products/create")
	public Admin postCustomer(@RequestBody Admin admin) {

		Admin _admin = repository.save(new Admin(admin.getProductname(),admin.getPrice(),admin.getDescription(),admin.getQuantity()));
		return  _admin;
	}
	
	@DeleteMapping("/admin/products/{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable("id") long id) {
		System.out.println("Delete Product with ID = " + id + "...");

		repository.deleteById(id);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}

	@DeleteMapping("/admin/products/delete")
	public ResponseEntity<String> deleteAllAdmins() {
		System.out.println("Delete All Products...");

		repository.deleteAll();

		return new ResponseEntity<>("All products have been deleted!", HttpStatus.OK);
	}
	
	@PutMapping("/admin/products/{id}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable("id") long id, @RequestBody Admin admin) {
		System.out.println("Update Admin with ID = " + id + "...");

		Optional<Admin> AdminData = repository.findById(id);

		if (AdminData.isPresent()) {
			Admin _admin = AdminData.get();
			_admin.setProductname(admin.getProductname());
			_admin.setPrice(admin.getPrice());
			_admin.setDescription(admin.getDescription());
			_admin.setQuantity(admin.getQuantity());
			_admin.setActive(admin.isActive());
			return new ResponseEntity<>(repository.save(_admin), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
