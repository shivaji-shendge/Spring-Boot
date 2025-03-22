package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modal.Employee;
import com.example.demo.repository.EmpRepo;
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepo emprepo;
	@Override
	public boolean isAdd(Employee e) {
		Employee emp=emprepo.save(e);
		return emp!=null?true:false;
	}

}
