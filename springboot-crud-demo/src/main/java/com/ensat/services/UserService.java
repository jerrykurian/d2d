package com.ensat.services;

import com.ensat.entities.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

}
