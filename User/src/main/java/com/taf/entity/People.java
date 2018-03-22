package com.taf.entity;

import org.springframework.stereotype.Service;

@Service
public class People {

	String name;
	Integer id;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "People{" +
        "name=" + name +
        ", id='" + id + '\'' +
        '}';
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
