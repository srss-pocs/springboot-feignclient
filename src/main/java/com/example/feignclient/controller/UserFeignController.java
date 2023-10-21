package com.example.feignclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignclient.client.UserFeignClient;
import com.example.feignclient.util.UserResponse;

@RestController
@RequestMapping("/api/feign")
public class UserFeignController {
	
	@Autowired
	private UserFeignClient client;
	
	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUser() {
		return client.getUsers();
	}

}
