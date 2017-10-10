package com.example.demo.model.sys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * The class Resources.
 *
 * Description:资源表
 *
 * @author: limenghui
 * @since: 2017年10月10日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class Resource implements Serializable {

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
	 * 父ID
	 */
	@Column(name = "pid", length = 64)
	private String pid;
	/**
	 * 类型
	 */
	@Column(name = "type", length = 64)
	private String type;//类型 1:菜单 2:按钮 3:菜单
	/**
	 * 菜单
	 */
	@Column(name = "menu", length = 64)
	private String menu;
	/**
	 * 按钮
	 */
	@Column(name = "button", length = 64)
	private String button;
	/**
	 * url
	 */
	@Column(name = "url", length = 64)
	private String url;
	/**
	 * 图标
	 */
	@Column(name = "icon", length = 64)
	private String icon;
	/**
	 * 描述
	 */
	@Column(name = "description", length = 64)
	private String description;
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

	public Resource() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
