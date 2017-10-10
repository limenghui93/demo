package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * The class User.
 *
 * Description:用户表
 *
 * @author: limenghui
 * @since: 2017年10月10日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class User implements Serializable {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String password;
	private String phone;
	private String email;
	private Date createTime;
	private Date updateTime;

	public User() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
