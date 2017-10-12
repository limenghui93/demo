package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ResourceRepository;
import com.example.demo.dao.RoleRepository;
import com.example.demo.dao.RoleResourceRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.dao.UserRoleRepository;
import com.example.demo.model.sys.Resource;
import com.example.demo.model.sys.Role;
import com.example.demo.model.sys.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private ResourceRepository resourceRepository;

	@Autowired
	private UserRoleRepository userRoleRepository;

	@Autowired
	private RoleResourceRepository roleResourceRepository;

	@Override
	public User getUser(String username, String password) {
		return userRepository.findByUsername(username, password);
	}

	@Override
	public List<Role> getRole(List<Long> list) {
		return null;
	}

	@Override
	public List<Resource> list(List<Long> list) {

		return null;

	}

	@Override
	public List<Long> getRoleId(Long id) {

		return null;

	}

	@Override
	public List<Long> getResourceId(List<Long> list) {

		return null;

	}

}
