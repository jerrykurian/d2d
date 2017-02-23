package com.d2d.crud.services;

import java.util.List;

import com.d2d.crud.model.User;

public interface UserService {
	public void create(User user);
	public User findById(long id);
	public List<User> findAll();
	public void delete(long id);
}
