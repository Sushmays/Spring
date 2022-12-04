package com.xworkz.springprograms.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springprograms.bean.Country;
import com.xworkz.springprograms.config.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext annot=new AnnotationConfigApplicationContext(SpringConfig.class);
		Country country=annot.getBean(Country.class);
		System.out.println(country);
	}

}
