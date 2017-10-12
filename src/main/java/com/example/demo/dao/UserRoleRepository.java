package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.sys.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

	@Query("select u.roleId from UserRole where u.userId in (?1)")
	public List<Long> findRoleIdByUserId(Long id);

}
