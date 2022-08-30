package com.mthor.springboot.resttemplate.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.mthor.springboot.resttemplate.app.entity.ApiUser;
import com.mthor.springboot.resttemplate.app.entity.TokenResponse;
import com.mthor.springboot.resttemplate.app.entity.User;
import com.mthor.springboot.resttemplate.app.entity.UserCredentials;
import com.mthor.springboot.resttemplate.app.service.IUserService;

@RestController
public class ApiController {
	
	public static final Logger log = LoggerFactory.getLogger(ApiController.class);
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/test/{id}")
	public User userById(@PathVariable Long id) {
		
		return userService.findById(id);
	}
	
	@GetMapping("/test")
	public List<User> userBy() {

		return userService.userList();		
	}
	
	@PostMapping("/test")
	public User create(@RequestBody User user) {
		//User newUser = new User(3L,150L,"Titulo nuevo", "Insercion nueva");
		return userService.create(user);
	}
	
	@PostMapping("/test/login")
	public TokenResponse login(@RequestBody UserCredentials credentials) {
		return userService.login(credentials);
	}
	
	@GetMapping("test/user/{id}")
	public ResponseEntity<?> getApiUser(@PathVariable Long id, @RequestHeader("Authorization") String token) {
	
		ApiUser apiUser = userService.apiUserById(id, token);
		return ResponseEntity.ok(apiUser);
	}

}
