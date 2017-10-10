package com.example.demo.model.sys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RoleResource implements Serializable {

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
	 * 角色id
	 */
	@Column(name = "role_id", length = 64)
	private String roleId;
	/**
	 * 资源id
	 */
	@Column(name = "resource_id", length = 64)
	private String resourceId;
	/**
	 * 创建时间
	 */
	@Column(name = "create_time", length = 64)
	private Date createTime;
	/**
	 * 更新时间
	 */
	@Column(name = "update_time", length = 64)
	private Date updateTime;

	public RoleResource() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Date getCreateDate() {
		return createTime;
	}

	public void setCreateDate(Date createDate) {
		this.createTime = createDate;
	}

	public Date getUpdateDate() {
		return updateTime;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateTime = updateDate;
	}

}
