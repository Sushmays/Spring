package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeautyParler {

	@Autowired
	private String beautyParlerOwner;
	@Autowired
	private Mirror mirror;

	public BeautyParler() {
		System.out.println("Creating default constructor");
	}
	public String getBeautyParlerOwner() {
		return beautyParlerOwner;
	}
	public void displayMirror() {
		System.out.println(mirror.getMirrorOwner());
	}
}
