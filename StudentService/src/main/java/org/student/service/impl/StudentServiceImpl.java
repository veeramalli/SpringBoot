package org.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.student.service.StudentService;
import org.student.service.dao.StudentDao;
import org.student.service.entity.Student;

@Component("StudentServiceImpl")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public Student getStudent(Student student) {
		return dao.get(student);
	}

}
