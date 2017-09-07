package com.sprinboot.demo.service;

import org.springframework.stereotype.Service;

import com.sprinboot.demo.entity.Student;

@Service
public interface StudentService {

	public Student getStudent(Student student);
	
}
