package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.sys.RoleResource;

public interface RoleResourceRepository extends JpaRepository<RoleResource, Long> {

	@Query("select r.resourceId from ResourceRole r where r.roleId in (?1)")
	public List<Long> findResourceIdByRoleId(List<Long> list);
}
