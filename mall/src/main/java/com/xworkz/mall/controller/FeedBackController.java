package com.xworkz.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.service.CustomerService;

@Controller
@RequestMapping("/feedback")
public class FeedBackController {
	
	@Autowired
	private CustomerService customerService;
	
	public FeedBackController() {
		System.out.println("created feedback controller using default constructor");
	}

	@PostMapping
	public String onSearch(String name,Model model) {
		List<CustomerEntity> findByName= customerService.findByName(name);
		
		if(findByName != null) {
			model.addAttribute("message", "Search data is found");
			model.addAttribute("list", findByName );
		}
		else {
			model.addAttribute("error", "Search data is not found");
		}
				
		return "feedBack";
		
	}
}
