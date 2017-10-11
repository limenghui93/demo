package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.sys.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);

	public User findById(Long id);

}
