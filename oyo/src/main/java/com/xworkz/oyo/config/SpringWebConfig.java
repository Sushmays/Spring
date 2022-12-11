package com.xworkz.oyo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringWebConfig {

	public SpringWebConfig() {
		System.out.println("Created  SpringWebConfig");
	}

}
