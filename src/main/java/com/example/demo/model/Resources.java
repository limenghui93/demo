package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

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
public class Resources implements Serializable {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */

	private static final long serialVersionUID = 1L;
	private String id;
	private String pid; //父id 上级ID
	private String type; // 1:菜单 2:按钮 3:接口
	private String menu; //菜单
	private String button;//按钮
	private String url; //url
	private String icon; //菜单图标
	private String description; //描述
	private Date createTime;
	private Date updateTime;

	public Resources() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
