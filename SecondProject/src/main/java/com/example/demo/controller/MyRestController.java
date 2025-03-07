package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Placement;

@RestController
public class MyRestController {
	List<Placement> list = new ArrayList<>();
	
	@GetMapping("/getplacementrecord")
	public List<Placement> getPlacementRecord(){
		
		Placement p1 = new Placement(1,"Mahesh","TCS",25000);
		Placement p2 = new Placement(1,"Ram","TCS",25000);
		Placement p3 = new Placement(1,"Shyam","TCS",25000);
		Placement p4 = new Placement(1,"Raju","TCS",25000);
		Placement p5 = new Placement(1,"Rahul","TCS",30000);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		return list;
	}

}
