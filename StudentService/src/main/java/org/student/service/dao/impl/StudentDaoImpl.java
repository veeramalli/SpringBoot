package org.student.service.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.student.service.dao.StudentDao;
import org.student.service.entity.Student;

@Component("StudentDaoImpl")
public class StudentDaoImpl implements StudentDao {

	@Override
	public Student get(Student student) {
		// TODO Auto-generated method stub
		return new Student(1000, "Sures11h");
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public int delete(Student student) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public List<Student> search(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
