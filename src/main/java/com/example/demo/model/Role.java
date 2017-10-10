package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.annotation.Resources;

/**
 * The class Role.
 *
 * Description:角色表
 *
 * @author: limenghui
 * @since: 2017年10月10日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class Role implements Serializable {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */

	private static final long serialVersionUID = 1L;
	private String id; //角色ID
	private String roleName; // 角色名
	private Set<Resources> resources; //资源列表;
	private Date crateTime;
	private Date updateTime;

	public Role() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Resources> getResources() {
		return resources;
	}

	public void setResources(Set<Resources> resources) {
		this.resources = resources;
	}

	public Date getCrateTime() {
		return crateTime;
	}

	public void setCrateTime(Date crateTime) {
		this.crateTime = crateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
