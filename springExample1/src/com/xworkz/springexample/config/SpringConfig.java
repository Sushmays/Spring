package com.xworkz.springexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springexample.bean.Ambulance;
import com.xworkz.springexample.bean.Borewell;
import com.xworkz.springexample.bean.Brand;
import com.xworkz.springexample.bean.Founder;
import com.xworkz.springexample.bean.Judge;
import com.xworkz.springexample.bean.Priest;


@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
		
		@Bean
		public String courtType() {
			System.out.println("Registering the courtType");
			return "Criminal";
		}
		
		@Bean
		public Judge judge() {
			System.out.println("Registering the judge");
			Judge judge1=new Judge("Dada", 10);
			return judge1;
		}
		
		@Bean
		public boolean judgeAlive() {
			System.out.println("Registering the judgeAlive");
			return true;
		}
		
		@Bean
		public int judgeAge() {
			System.out.println("Registering the judgeAge");
			return 65;
		}
		@Bean
		public Brand brand() {
			System.out.println("Registering the brand");
			Brand brn=new Brand("BagadiPlus", "Apple");
			return brn;
		}

		@Bean
		public double brandPrice() {
			System.out.println("Registering the brandPrice");
			return 1500;
		}

		@Bean
		public Priest priest() {
			System.out.println("Registering the priest");
			Priest priest=new Priest("RamaKrishnaMurthy", 62);
			return priest;
		}
		
		@Bean
		public int priestSince() {
			System.out.println("Registering the priestSince");
			return 1960;
		}
		
		@Bean
		public String priestType() {
			System.out.println("Registering the priestType");
			return "Sanskrith";
		}
		
		@Bean
		public Ambulance ambulance() {
			System.out.println("Registering the ambulance");
			Ambulance ambu=new Ambulance("Omini", "Suresh");
			return ambu;			
		}
		
		@Bean
		public boolean ambulanceCleaner() {
			System.out.println("Registering the ambulanceCleaner");
			return true;
		}
		
		@Bean
		public String ambulanceServiceType() {
			System.out.println("Registering the ambulanceServiceType");
			return "PaidService";
		}
		
		@Bean
		public Founder founder() {
			System.out.println("Registering the founder");
			Founder founder=new Founder("Omkar", 40);
			return founder;			
		}
		
		@Bean
		public boolean alive() {
			System.out.println("Registering the alive");
			return true;
		}
		
		@Bean
		public boolean married() {
			System.out.println("Registering the married");
			return true;
		}
		
		@Bean
		public Borewell borewell() {
			System.out.println("Registering the borewell");
			Borewell bore=new Borewell(150, 25);
			return bore;
		}
		
		@Bean
		public String borewellOwner() {
			System.out.println("Registering the borewellOwner");
			return "Shankar";
		}
		
		@Bean
		public boolean borewellOwnerAlive() {
			System.out.println("Registering the borewellOwnerAlive");
			return true;
		}
		
}
