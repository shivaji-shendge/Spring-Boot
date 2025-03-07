package com.example.demo;

public class Placement {
	private int id;
	private String studName;
	private String comName;
	private int sal;
	
	public Placement(int id, String studName, String comName, int sal) {
		super();
		this.id = id;
		this.studName = studName;
		this.comName = comName;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	

}
