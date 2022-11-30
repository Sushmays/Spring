package com.xworkz.springexample.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springexample.bean.Ambulance;
import com.xworkz.springexample.bean.Borewell;
import com.xworkz.springexample.bean.Brand;
import com.xworkz.springexample.bean.Court;
import com.xworkz.springexample.bean.Founder;
import com.xworkz.springexample.bean.Hospital;
import com.xworkz.springexample.bean.Institute;
import com.xworkz.springexample.bean.Judge;
import com.xworkz.springexample.bean.Land;
import com.xworkz.springexample.bean.MRP;
import com.xworkz.springexample.bean.Priest;
import com.xworkz.springexample.bean.Temple;
import com.xworkz.springexample.config.SpringConfig;

public class SpringBoot {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annot = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(annot.getBeanDefinitionCount());
		String[]  array=annot.getBeanDefinitionNames();
		for (String string : array) {
			System.out.println(string);
		}
		
		System.out.println("============Court==============");
		Court court= annot.getBean(Court.class);
		System.out.println(court);
		System.out.println("===========Judge=================");
		Judge judge=annot.getBean(Judge.class);
		System.out.println(judge);
		System.out.println("==============MRP================");
		MRP mrp=annot.getBean(MRP.class);
		System.out.println(mrp);
		System.out.println("============Brand================");
		Brand brand=annot.getBean(Brand.class);
		System.out.println(brand);
		System.out.println("==============Temple=============");
		Temple temple=annot.getBean(Temple.class);
		System.out.println(temple);
		System.out.println("==============Priest=============");
		Priest priest=annot.getBean(Priest.class);
		System.out.println(priest);
		System.out.println("=============Hospital===============");
		Hospital hospital=annot.getBean(Hospital.class);
		System.out.println(hospital);
		System.out.println("=============Ambulance===============");
		Ambulance ambulance=annot.getBean(Ambulance.class);
		System.out.println(ambulance);
		System.out.println("=============Land===============");
		Land land=annot.getBean(Land.class);
		System.out.println(land);
		System.out.println("============Borewell================");
		Borewell borewell=annot.getBean(Borewell.class);
		System.out.println(borewell);
		System.out.println("============Institute================");
		Institute institute=annot.getBean(Institute.class);
		System.out.println(institute);
		System.out.println("============Founder================");
		Founder founder=annot.getBean(Founder.class);
		System.out.println(founder);
		
	}

}
