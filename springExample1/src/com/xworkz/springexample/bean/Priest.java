package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Priest {
	
	private String priestName;
	private int age;
	private int experience;
	@Autowired
	@Qualifier("priestSince")
	private int since;
	@Autowired
	@Qualifier("priestType")
	private String type;
	
	public Priest(String priestName, int age) {
		super();
		this.priestName = priestName;
		this.age = age;
	}
	@Value("12")
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Priest [priestName=" + priestName + ", age=" + age + ", experience=" + experience + ", since=" + since
				+ ", type=" + type + "]";
	}
	
}
