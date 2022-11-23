package com.xworkz.springProgram.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springProgram.bean.Animals;
import com.xworkz.springProgram.bean.Bottle;
import com.xworkz.springProgram.bean.Colors;
import com.xworkz.springProgram.bean.Metro;
import com.xworkz.springProgram.bean.Numbers;
import com.xworkz.springProgram.bean.Purifier;
import com.xworkz.springProgram.bean.Slipper;
import com.xworkz.springProgram.bean.Water;
import com.xworkz.springProgram.config.SpringConfig;

public class SpringMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfig.class);
		Water water= spring.getBean(Water.class);
		System.out.println(water.hashCode());
		
		String string=spring.getBean("bottleColor", String.class);
		System.out.println(string.hashCode());
		
		Bottle bottle=spring.getBean(Bottle.class);
		bottle.storeWater();
		System.out.println(bottle.hashCode());
		
		//Slipper slipper= spring.getBean(Slipper.class);
		//System.out.println(slipper.hashCode());
		
		Double doub= spring.getBean("purifierPrice",double.class);
		System.out.println(doub.hashCode());
		
		String purifier=spring.getBean("purifierColor",String.class);
		System.out.println(purifier.hashCode());
		
		Boolean boolean1= spring.getBean(boolean.class);
		System.out.println(boolean1.hashCode());
		
		Integer integer= spring.getBean("noOfPorts",int.class);
		System.out.println(integer.hashCode());
		
		Metro metro= spring.getBean(Metro.class);
		System.out.println(metro.getName().hashCode());

		System.out.println(spring.getBean(Colors.class).hashCode());
		
		System.out.println(spring.getBean(Animals.class).hashCode());
		
		System.out.println(spring.getBean(Numbers.class).hashCode());
		
		Integer integer1=spring.getBean("one", Integer.class);
		System.out.println(integer1.hashCode());
		
		System.out.println(spring.getBean("two",Integer.class).hashCode());
		System.out.println(spring.getBean("twentyOne",Integer.class).hashCode());
		System.out.println(spring.getBean("thirtyThree",Integer.class).hashCode());
		System.out.println(spring.getBean("fourtySix",Integer.class).hashCode());
		System.out.println(spring.getBean("fiftyFive",Integer.class).hashCode());
		System.out.println(spring.getBean("sixtyTwo",Integer.class).hashCode());
		System.out.println(spring.getBean("twentySeven",Integer.class).hashCode());
		System.out.println(spring.getBean("sixteen",Integer.class).hashCode());
		System.out.println(spring.getBean("twoHundred",Integer.class).hashCode());
		System.out.println(spring.getBean("nineteen",Integer.class).hashCode());
		System.out.println(spring.getBean("sixty",Integer.class).hashCode());
		System.out.println(spring.getBean("fifty",Integer.class).hashCode());
		System.out.println(spring.getBean("fourty",Integer.class).hashCode());
		System.out.println(spring.getBean("twoHundredTwenty",Integer.class).hashCode());
		System.out.println(spring.getBean("seven",Integer.class).hashCode());		
	}

}
