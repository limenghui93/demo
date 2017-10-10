package com.example.demo.model.sys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */

	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	/**
	 * 账号
	 */
	@Column(name = "username", length = 100)
	private String username;
	/**
	 * 密码
	 */
	@Column(name = "password", length = 32)
	private String password;
	/**
	 * 姓名
	 */
	@Column(name = "name", length = 64)
	private String name;
	/**
	 * 电话
	 */
	@Column(name = "phone", length = 15)
	private String phone;
	/**
	 * 电子邮件
	 */
	@Column(name = "email", length = 20)
	private String email;
	/**
	 * 创建时间
	 */
	@Column(name = "create_time", length = 20)
	private Date createTime;
	/**
	 * 更新时间
	 */
	@Column(name = "update_time", length = 20)
	private Date updateTime;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
