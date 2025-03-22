package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/addstudent")
	public String addStudent(@RequestBody Student student) {
		boolean b = service.isAddStudent(student);
		return b? "Student added Successfully" : "Student added FAILED";	
	}
	
	@GetMapping("/getallstudents")
	public List<Student> getAllStudents(){
		List<Student> list = null;
		list=service.getAllStudents();
		return list;
	}
}
