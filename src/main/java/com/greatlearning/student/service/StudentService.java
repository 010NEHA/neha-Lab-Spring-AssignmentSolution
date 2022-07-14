package com.greatlearning.student.service;

import java.util.List;

import com.greatlearning.student.model.Student;

public interface StudentService {
	
	public List<Student> findAllStudent();
	public Student findById(int id);
	public Student save(Student student);
	public void deleteById(int id);

}
