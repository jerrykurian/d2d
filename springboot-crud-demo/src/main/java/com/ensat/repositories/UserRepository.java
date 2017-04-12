package com.ensat.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ensat.entities.User;

public interface UserRepository extends CrudRepository<User, Long>  {
	User findByUsername(String username);
}
