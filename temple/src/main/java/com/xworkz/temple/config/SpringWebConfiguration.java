package com.xworkz.temple.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringWebConfiguration {

	public SpringWebConfiguration() {
		System.out.println("Created SpringWebConfiguration using default constructor");
	}

}
