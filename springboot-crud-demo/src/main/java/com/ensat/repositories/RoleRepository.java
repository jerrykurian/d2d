package com.ensat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensat.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
