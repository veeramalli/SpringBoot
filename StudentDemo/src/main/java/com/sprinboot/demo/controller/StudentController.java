package com.sprinboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprinboot.demo.entity.Student;
import com.sprinboot.demo.service.StudentService;

@EnableAutoConfiguration
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	private Student getStudent(int id, String name) {
		
		return service.getStudent(new Student(id, name));

	}
}
