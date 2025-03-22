package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Student;
import com.example.demo.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo repo;
	@Override
	public boolean isAddStudent(Student student) {	
		return repo.isAddStudent(student);
	}

	@Override
	public List<Student> getAllStudents() {	
		return repo.getAllStudents();
	}

	@Override
	public boolean isUpdateStudent(Student student) {
		return repo.isUpdateStudent(student);
	}

	@Override
	public boolean isDeleteStudent(Student student) {
		return repo.isDeleteStudent(student);
	}

}
