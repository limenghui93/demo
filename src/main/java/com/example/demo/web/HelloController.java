package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class HelloController {

	@GetMapping(value = "/hello", produces = "application/json")
	public User hello() {
		User user = new User();
		return user;
	}
}
