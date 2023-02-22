package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.entity.AdminEntity;
import com.xworkz.mall.service.MallService;


@Controller
@RequestMapping("/mall")
public class MallController {

	@Autowired
	private MallService service;

	public MallController() {
		System.out.println("mall controller in default const");
	}

	@PostMapping
	public String onLogin(Model model, @RequestParam String adminName, @RequestParam String password) {
		System.out.println("running on login methos");
		AdminEntity findByAdminNameAndPassword = service.findByAdminNameAndPassword(adminName, password);
		AdminEntity findByName = service.findByName(adminName);
		
		if (findByAdminNameAndPassword == null || findByName == null)
		 {
			System.out.println("Given Credential are invalid");
			model.addAttribute("error", "Credential are not matching");

			if (findByName!= null && findByName.getAccountLocked().equals("locked")) {
				System.out.println("Account is locked");
				model.addAttribute("error", "your account is locked reset the password");
				return "admin";
			}
			return "admin";
		}
		if (findByAdminNameAndPassword != null) {
			if (findByAdminNameAndPassword.getAccountLocked().equals("Unlocked") && findByAdminNameAndPassword.getLoginCount()>1) {
				System.out.println("Account is Unlocked");
				model.addAttribute("message", "Credential are matched");
				model.addAttribute("dto",findByAdminNameAndPassword );
				return "customerDetail";
			}

			if (findByAdminNameAndPassword.getLoginCount() <=1) {
				System.out.println("Welcome to our page please change your password");
				model.addAttribute("message", "Congratulations you have in logged please change your password");
				return "reset";
			}
			return "admin";
		}
		return "admin";
	}
	

}
