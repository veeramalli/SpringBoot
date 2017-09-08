package com.sprinboot.demo.service.impl;

import org.springframework.stereotype.Component;

import com.sprinboot.demo.entity.Student;
import com.sprinboot.demo.service.StudentService;

@Component("StudentServiceImpl")
public class StudentServiceImpl implements StudentService{
	
	/*@Autowired
	private StudentDao dao;*/
	
	@Override
	public Student getStudent(Student student) {
		//return dao.get(student);
		return new Student(100, "Suresh");
	}

}
