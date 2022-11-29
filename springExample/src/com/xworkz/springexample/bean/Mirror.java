package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mirror {
	@Autowired
	private String mirrorOwner;
	
	public Mirror() {
		System.out.println("creating mirror using default constructor");
	}
	public String getMirrorOwner() {
		return mirrorOwner;
	}

}
