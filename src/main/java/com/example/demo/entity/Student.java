package com.example.demo.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Student {
	private Integer id;
	private String name;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;//创建时间
	
	/**
	 * 不返回这个数据
	 * serialize = false
	 */
	@JSONField(serialize = false)
	private String remark;//备注
	
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
