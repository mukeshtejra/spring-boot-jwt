package com.springboot.security.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springboot.security.jwt.model.User;

@Service
public class UserService {

	List<User> users = new ArrayList<>();
	public UserService() {
		users.add(new User(UUID.randomUUID().toString(), "1234", "mukesh@gmail.com"));
		
		users.add(new User(UUID.randomUUID().toString(), "12345", "rakesh@gmail.com"));
		
		users.add(new User(UUID.randomUUID().toString(), "12345", "sita@gmail.com"));

	}
	
	
	public List<User> getUsers(){
		return users;
	}
}
