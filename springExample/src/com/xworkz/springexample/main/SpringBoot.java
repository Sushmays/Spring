package com.xworkz.springexample.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.org.apache.xalan.internal.utils.FeaturePropertyBase.State;
import com.xworkz.springexample.bean.Bakery;
import com.xworkz.springexample.bean.BeautyParler;
import com.xworkz.springexample.bean.BikeLock;
import com.xworkz.springexample.bean.Bottle;
import com.xworkz.springexample.bean.Bus;
import com.xworkz.springexample.bean.ChickenCentre;
import com.xworkz.springexample.bean.Chiken;
import com.xworkz.springexample.bean.Fan;
import com.xworkz.springexample.bean.Finger;
import com.xworkz.springexample.bean.House;
import com.xworkz.springexample.bean.Human;
import com.xworkz.springexample.bean.HumanBody;
import com.xworkz.springexample.bean.Karnataka;
import com.xworkz.springexample.bean.Kitchen;
import com.xworkz.springexample.bean.Laptop;
import com.xworkz.springexample.bean.Pen;
import com.xworkz.springexample.bean.Saloon;
import com.xworkz.springexample.bean.Statee;
import com.xworkz.springexample.bean.Theator;
import com.xworkz.springexample.bean.Tv;
import com.xworkz.springexample.bean.Village;
import com.xworkz.springexample.springconfig.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(SpringConfig.class);

		System.out.println(config.getBeanDefinitionCount());
		String[] str = config.getBeanDefinitionNames();
		for (String string : str) {
			System.out.println(string);
		}
		System.out.println("===================Tv=======================");
		Tv tv= config.getBean(Tv.class);
		System.out.println(tv.getBrand());
		System.out.println(tv.getOwnerName());
		System.out.println("===========Saloon====================");
		Saloon saloo= config.getBean(Saloon.class);
		System.out.println(saloo.getSaloonRent());
		System.out.println(saloo.getOwnerName());
		System.out.println("=============================");
		saloo.displayTvDetails();
		System.out.println("=============Chiken================");
		Chiken chiken= config.getBean(Chiken.class);
		ChickenCentre chickenCentre=config.getBean(ChickenCentre.class);
		chickenCentre.displayChicken();
		System.out.println(chickenCentre.getChickenPrice());
		System.out.println("=============Laptop================");
		Laptop laptop=config.getBean(Laptop.class);
		laptop.displayKeyBoard();
		System.out.println(laptop.getLaptopBrand());
		System.out.println("=============Kitchen================");
		Kitchen kitchen=config.getBean(Kitchen.class);
		System.out.println(kitchen.getKitchenOwner());
		kitchen.displayStove();
		System.out.println("=============HumanBody================");
		HumanBody humanBody=config.getBean(HumanBody.class);
		System.out.println(humanBody.getHumanName());
		humanBody.displayMouth();
		System.out.println("=============Bakery================");
		Bakery bakery=config.getBean(Bakery.class);
		System.out.println(bakery.getBakeryOwner());
		bakery.displayRef();
		System.out.println("=============House================");
		House house=config.getBean(House.class);
		house.displayDyning();
		System.out.println(house.getOwnerNaam());
		System.out.println("=============Bus================");
		Bus bus=config.getBean(Bus.class);
		System.out.println(bus.getBusName());
		bus.displayDriver();
		System.out.println("=============Theator================");
		Theator theator=config.getBean(Theator.class);
		System.out.println(theator.getTheatorName());
		theator.displayProj();
		System.out.println("=============BeautyParler================");
		BeautyParler beautyParler=config.getBean(BeautyParler.class);
		System.out.println(beautyParler.getBeautyParlerOwner());
		beautyParler.displayMirror();	
		System.out.println("=============BikeLock================");
		BikeLock bikeLock=config.getBean(BikeLock.class);
		System.out.println(bikeLock.getBikeName());
		bikeLock.displayKey();
		System.out.println("=============Human================");
		Human human=config.getBean(Human.class);
		System.out.println(human.getHumanName());
		human.displayNose();
		System.out.println("=============Pen================");
		Pen pen=config.getBean(Pen.class);
		System.out.println(pen.getColor());
		pen.displayrefill();
		System.out.println("=============Bottle================");
		Bottle bottle=config.getBean(Bottle.class);
		System.out.println(bottle.getBottleColor());
		bottle.displayCap();
		System.out.println("=============Finger================");
		Finger finger=config.getBean(Finger.class);
		System.out.println(finger.getFingerLength());
		finger.displayNail();
		System.out.println("===============Karnataka===================");
		Karnataka karnataka=config.getBean(Karnataka.class);
		karnataka.displayCapital();
		System.out.println("==============Village====================");
		Village village=config.getBean(Village.class);
		village.displayDistrict();		
		System.out.println("==============State====================");
		Statee statee=config.getBean(Statee.class);
		statee.displayStatecapital();
		System.out.println("================Fan==================");
		Fan fan=config.getBean(Fan.class);
		fan.displayRotor();	
		
	}
}
