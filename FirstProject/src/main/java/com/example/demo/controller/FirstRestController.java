package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

@RestController
public class FirstRestController {
@GetMapping("/home")
public String home() {
	return "Hello World";	
}
@GetMapping("/getemp")
public Employee getEmployee() {
	Employee emp = new Employee();
	emp.setId(2);
	emp.setName("Vishal");
	emp.setSal(20000);
	return emp;
	
}
}
