package com.example.demo.service;

import java.util.List;

import com.example.demo.model.sys.Resource;
import com.example.demo.model.sys.Role;
import com.example.demo.model.sys.User;

public interface UserService {

	/**
	 * 获取用户
	 * @param username
	 * @param password
	 * @return
	 */
	public User getUser(String username, String password);

	/**
	 * 获取角色
	 * @param list
	 * @return
	 */
	public List<Role> getRole(List<Long> list);

	/**
	 * 获取资源
	 * @param list
	 * @return
	 */
	public List<Resource> list(List<Long> list);

	/**
	 * 获取角色ID
	 * @param id
	 * @return
	 */
	public List<Long> getRoleId(Long id);

	/**
	 * 获取资源ID
	 * @param list
	 * @return
	 */
	public List<Long> getResourceId(List<Long> list);

}
