package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Judge {
	
	private String judgeName;
	@Autowired
	@Qualifier("judgeAge")
	private int age;
	private int experience;
	@Autowired
	@Qualifier("judgeAlive")
	private boolean alive;
	//@Autowired
	//@Qualifier("caseseHandled")
	private int caseseHandled;
	
	public Judge(String judgeName, int experience) {
		super();
		this.judgeName = judgeName;
		this.experience = experience;
	}

	@Value("30")
	public void setcaseseHandled(int caseseHandled) {
		this.caseseHandled = caseseHandled;
	}

	@Override
	public String toString() {
		return "Judge [judgeName=" + judgeName + ", age=" + age + ", experience=" + experience + ", alive=" + alive
				+ ", caseseHandled=" + caseseHandled + "]";
	}
	
	
	
	

}
