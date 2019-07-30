package com.supermarket.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.supermarket.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long> {
	List<Admin> findByProductname(String productname);
}
