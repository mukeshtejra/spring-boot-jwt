package com.springboot.security.jwt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.jwt.model.User;
import com.springboot.security.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userService.getUsers();
		
	}
	
	
	@GetMapping("/current_user")
	public String getCurrentLoggedInUser(Principal principal) {
		return principal.getName();
		
	}
	
	
}
