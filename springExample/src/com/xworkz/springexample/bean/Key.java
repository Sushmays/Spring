package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Key {
	@Autowired
	private String keyType;

	public Key() {
		System.out.println("creating key using default constructor");
	}

	public String getKeyType() {
		return keyType;
	}
}
