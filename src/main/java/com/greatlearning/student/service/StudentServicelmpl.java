package com.greatlearning.student.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.student.model.Student;
import com.greatlearning.student.repository.StudentRepository;

@Service
public class StudentServicelmpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@Override
	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
		
	}

}
