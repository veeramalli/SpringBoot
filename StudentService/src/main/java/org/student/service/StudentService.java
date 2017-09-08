package org.student.service;

import org.springframework.stereotype.Component;
import org.student.service.entity.Student;

@Component
public interface StudentService {

	public Student getStudent(Student student);
	
}
