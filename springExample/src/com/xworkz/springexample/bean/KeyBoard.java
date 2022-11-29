package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KeyBoard {
	@Autowired
	private String keyBoardOwner;

	public KeyBoard() {
		System.out.println("Creating keyBoard using default constructor");
	}
	
	public String getKeyBoardOwner() {
		return keyBoardOwner;
	}

}
