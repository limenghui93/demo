package com.example.demo.model.sys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * The class UserRole.
 *
 * Description: 用户——角色 关联表
 *
 * @author: limenghui
 * @since: 2017年10月10日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class UserRole implements Serializable {

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
	 * 用户id
	 */
	@Column(name = "user_id", length = 64)
	private String userId;
	/**
	 * 角色id
	 */
	@Column(name = "role_id", length = 64)
	private String roleId;
	/**
	 * 创建时间
	 */
	@Column(name = "create_time", length = 20)
	private Date createTime;
	/**
	 * 更新时间
	 */
	@Column(name = "create_time", length = 20)
	private Date updateTime;

	public UserRole() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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
