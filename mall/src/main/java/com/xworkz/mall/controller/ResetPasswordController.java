package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.entity.AdminEntity;
import com.xworkz.mall.service.MallService;

@Controller
@RequestMapping("/reset")
public class ResetPasswordController {
	
	@Autowired
	private MallService service;

	public void ResetPassword() {
		System.out.println("ResetPassword in default constr ");
	}

	@GetMapping
	public String onForget(@RequestParam String name, Model model) {
		//AdminEntity findByMallName = service.findByMallName(name);
		if (name!= null) {
			service.findByMallName(name);
			model.addAttribute("message", "password is sent to your mail id");
			return "newp";
		} else {
			if (name == null) {
				model.addAttribute("error", "selected mall is not found");
				return "reset";
			}
		}
		return null;
	
	}
	

}
