package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	private String laptopBrand;
	@Autowired
	private KeyBoard keyBoard;

	public Laptop() {
		System.out.println("creating laptop using default constructor");
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void displayKeyBoard() {
		System.out.println(keyBoard.getKeyBoardOwner());
	}

}
