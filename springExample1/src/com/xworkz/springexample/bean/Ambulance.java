package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Ambulance {

	private String ambulanceType;
	private String driverName;
	private boolean body;
	@Autowired
	@Qualifier("ambulanceCleaner")
	private boolean cleaner;
	@Autowired
	@Qualifier("ambulanceServiceType")
	private String serviceType;

	public Ambulance(String ambulanceType, String driverName) {
		super();
		this.ambulanceType = ambulanceType;
		this.driverName = driverName;
	}

	@Value("true")
	public void setBody(boolean body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Ambulance [ambulanceType=" + ambulanceType + ", driverName=" + driverName + ", body=" + body
				+ ", cleaner=" + cleaner + ", serviceType=" + serviceType + "]";
	}
	

}
