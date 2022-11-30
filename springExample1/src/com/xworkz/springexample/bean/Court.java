package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Court {

	private String courtName;
	@Value("10.30")
	private double openTime;
	@Autowired
	@Qualifier("courtType")
	private String type;

	public Court(@Value("Govt court") String courtName) {
		super();
		this.courtName = courtName;
	}

	public String setType() {
		return type;
	}

	@Override
	public String toString() {
		return "Court [courtName=" + courtName + ", openTime=" + openTime + ", type=" + type + "]";
	}
	
}
