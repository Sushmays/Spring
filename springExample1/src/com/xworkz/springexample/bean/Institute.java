package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Institute {
	
	private String instituteName;
	@Value("true")
	private boolean open;
	private String instituteFounder;
	
	public Institute(@Value("X-workz") String instituteName) {
		super();
		this.instituteName = instituteName;
	}
	@Value("Omkar")
	public void setInstituteFounder(String instituteFounder) {
		this.instituteFounder = instituteFounder;
	}
	@Override
	public String toString() {
		return "Institute [instituteName=" + instituteName + ", open=" + open + ", instituteFounder=" + instituteFounder
				+ "]";
	}
	
}
