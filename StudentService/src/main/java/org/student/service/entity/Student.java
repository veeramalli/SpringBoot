package org.student.service.entity;

import org.springframework.stereotype.Component;

@Component("Student")
public class Student {
	
	public Student(){};
	
	private int eid;
	private String name;
	
	public Student(int id, String name) {
		this.eid = id;
		this.name = name;
	}
	
	public int getId() {
		return eid;
	}
	public void setId(int id) {
		this.eid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
