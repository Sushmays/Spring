package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.service.MallService;

@Controller
@RequestMapping("/newPassword")
public class NewPasswordController {

	@Autowired
	private MallService service;

	public NewPasswordController() {
		System.out.println("default const for ForgetPasswordController");
	}
	@GetMapping
	public String onClick(@RequestParam String generatedPassword,@RequestParam String password,@RequestParam String password1, Model model) {
	
		if(generatedPassword!=null && password.equals(password1)) {
			service.updatePasswordByGeneratedPassword(generatedPassword,password1);
			model.addAttribute("message", "password is reset and updated");
			return "newp";
		}else {
			model.addAttribute("error", "password not updated");
			return "newp";
		}
		
		
	}
	
}
