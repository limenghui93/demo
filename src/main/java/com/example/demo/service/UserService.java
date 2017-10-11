package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.sys.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getUserInfo(String username) {
		User user = userRepository.findByUsername(username);
		return user;
	}

}
