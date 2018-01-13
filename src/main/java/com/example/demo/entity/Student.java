package com.example.demo.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Student {
	private Integer id;
	private String name;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;//创建时间
	
	
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
