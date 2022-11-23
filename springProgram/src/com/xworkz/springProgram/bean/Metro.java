package com.xworkz.springProgram.bean;

public class Metro {

	private String name;
	public Metro() {
		System.out.println("Metro default constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Metro [name=" + name + "]";
	}
	
	
	
}
