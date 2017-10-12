package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.sys.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	@Query("select r from Role r where r.id = ?1")
	public Role findById(Long id);

	@Query("select r form Role r where r.id in (?1)")
	public List<Role> findRoleListById(List<Long> list);

}
