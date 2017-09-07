package com.sprinboot.demo.dao.impl;

import java.util.List;

import com.sprinboot.demo.dao.StudentDao;
import com.sprinboot.demo.entity.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public Student get(Student student) {
		// TODO Auto-generated method stub
		return new Student(100, "Suresh");
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
