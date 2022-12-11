package com.xworkz.chappal.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringWebConfig {

	public SpringWebConfig() {
		System.out.println("Created SpringWebConfig");
	}

}
