package com.example.demo.web.sys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.sys.User;
import com.example.demo.service.impl.UserServiceImpl;

@RestController
public class UserController {

	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserServiceImpl userService;

	@GetMapping(value = "/getUserInfo")
	public User getUserInfo(String username, String password) {
		return userService.getUser(username, password);
	}
}
