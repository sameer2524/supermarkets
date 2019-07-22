package com.supermarket.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


import com.supermarket.model.Role;
import com.supermarket.model.RoleName;

public interface RoleRepository extends JpaRepositoryImplementation<Role, Long> {
	Optional<Role> findByName(RoleName roleName);
}
