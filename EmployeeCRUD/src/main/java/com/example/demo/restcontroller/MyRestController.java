package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modal.Employee;
import com.example.demo.service.EmpService;

@RestController
public class MyRestController {
	@Autowired
	private EmpService service;
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee e ) {
		
		boolean b=service.isAdd(e);
		return b?"data added sucess":"unadded ";
	}

}
