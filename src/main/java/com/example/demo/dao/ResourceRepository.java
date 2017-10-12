package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.sys.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

	public Resource getByid(Long id);

	@Query("select r from Resource r where r.id in (?1)")
	public List<Resource> getResourceListById(List<Long> list);

}
