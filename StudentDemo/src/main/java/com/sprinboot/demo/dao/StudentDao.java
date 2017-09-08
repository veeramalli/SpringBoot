package com.sprinboot.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sprinboot.demo.entity.Student;

@Component("StudentDao")
public interface StudentDao {
	
	public Student get(Student student);
	
	public Student update(Student student);
	
	public int delete(Student student);
	
	public List<Student> search(Student student);
	
}
