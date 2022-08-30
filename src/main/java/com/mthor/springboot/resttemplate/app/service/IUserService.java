package com.mthor.springboot.resttemplate.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mthor.springboot.resttemplate.app.entity.ApiUser;
import com.mthor.springboot.resttemplate.app.entity.TokenResponse;
import com.mthor.springboot.resttemplate.app.entity.User;
import com.mthor.springboot.resttemplate.app.entity.UserCredentials;

public interface IUserService {

	List<User> userList();
	
	User findById(Long id);
	
	User create(User user);
	
	TokenResponse login(UserCredentials credentials);
	
	ApiUser apiUserById(Long id, String token);
}
