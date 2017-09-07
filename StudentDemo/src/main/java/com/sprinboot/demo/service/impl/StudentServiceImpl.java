package com.sprinboot.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sprinboot.demo.dao.StudentDao;
import com.sprinboot.demo.entity.Student;
import com.sprinboot.demo.service.StudentService;


public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public Student getStudent(Student student) {
		return dao.get(student);
	}

}
