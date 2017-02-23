package com.d2d.crud.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.d2d.crud.model.User;
import com.d2d.crud.services.UserService;

public class UserServiceImpl implements UserService {
	private UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	private static UserService userService = null;
	public static UserService instance(){
		if(userService==null){
			userService = new UserServiceImpl();
		}
		return userService;
	}
	
	private List<User> users = new ArrayList<User>();
	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return this.users.get(new Long(id).intValue());
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		this.users.remove(new Long(id).intValue());
	}

}
