package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.sys.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u where u.username = ?1 and password =?2")
	public User findByUsername(String username, String password);

	public User findById(Long id);

}
