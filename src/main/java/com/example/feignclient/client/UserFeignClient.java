package com.example.feignclient.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.feignclient.util.UserResponse;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "USER-CLIENT")
public interface UserFeignClient {

	@GetMapping("/users")
	public List<UserResponse> getUsers();

}
