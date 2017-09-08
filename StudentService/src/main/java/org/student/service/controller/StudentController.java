package org.student.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.student.service.StudentService;
import org.student.service.entity.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("/get")
	public Student get(Student student) {
		return service.getStudent(student);
	}
}
