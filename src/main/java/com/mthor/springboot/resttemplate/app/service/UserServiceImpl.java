package com.mthor.springboot.resttemplate.app.service;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.mthor.springboot.resttemplate.app.entity.ApiUser;
import com.mthor.springboot.resttemplate.app.entity.TokenResponse;
import com.mthor.springboot.resttemplate.app.entity.User;
import com.mthor.springboot.resttemplate.app.entity.UserCredentials;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private RestTemplate userRest;

	@Override
	public List<User> userList() {
		List<User> users = Arrays
				.asList(userRest.getForObject("https://jsonplaceholder.typicode.com/posts", User[].class));
		return users;
	}

	@Override
	public User findById(Long id) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("id", id.toString());
		// String url =
		// "https://jsonplaceholder.typicode.com/posts/".concat(id.toString());
		User user = userRest.getForObject("https://jsonplaceholder.typicode.com/posts/{id}", User.class, param);
		return user;
	}

	@Override
	public User create(User user) {

		User postedUser = userRest.postForObject("https://jsonplaceholder.typicode.com/posts", user, User.class);
		return postedUser;
	}

	@Override
	public TokenResponse login(UserCredentials credentials) {

		TokenResponse tokenResponse = userRest.postForObject("http://auth-gym-ms.herokuapp.com/login/", credentials,
				TokenResponse.class);
		return tokenResponse;
	}

	@Override
	public ApiUser apiUserById(Long id, String token) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(token.split(" ")[1]);
		
		Map<String, Object> map = new HashMap<>();
        map.put("id", id);
		URI uri = UriComponentsBuilder.newInstance().scheme("http").host("auth-gym-ms.herokuapp.com")
                .path("account/{id}").buildAndExpand(map).toUri();
		RequestEntity<Object> requestEntity = new RequestEntity<Object>(headers, HttpMethod.GET, uri);
		
		return userRest.exchange(requestEntity, ApiUser.class).getBody();
		
	}

}
