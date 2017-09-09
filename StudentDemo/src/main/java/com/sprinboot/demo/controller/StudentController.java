package com.sprinboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinboot.demo.entity.Student;
import com.sprinboot.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("/get")
	private Student getStudent(Student student) {
		return service.getStudent(student);

	}
}
