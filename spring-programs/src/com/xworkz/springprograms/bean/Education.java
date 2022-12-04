package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Education {
	
	@Value("1")
	private String id;
	@Value("University of Delhi")
	private String university;
	@Value("Political Science")
	private String branch;
	@Value("1978")
	private int year;
	@Value("Delhi")
	private String place;
	@Value("false")
	private boolean backlogs;
	@Value("53.02")
	private double percentage;
	@Value("true")
	private boolean passed;
	
	
	@Override
	public String toString() {
		return "Education [id=" + id + ", university=" + university + ", branch=" + branch + ", year=" + year
				+ ", place=" + place + ", backlogs=" + backlogs + ", percentage=" + percentage + ", passed=" + passed
				+ "]";
	}
	
	
	
	

}
