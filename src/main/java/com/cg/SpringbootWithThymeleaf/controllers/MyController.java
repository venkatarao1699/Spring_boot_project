package com.cg.SpringbootWithThymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.SpringbootWithThymeleaf.Services.UserService;
import com.cg.SpringbootWithThymeleaf.entities.User;

@Controller
public class MyController {
	@Autowired
	private UserService service;
	@GetMapping("/regPage")
	public String openReg(Model model) {
		model.addAttribute("user", new User());
		
	return "registration";
	}
	
	@PostMapping("/regForm")
	public String submitForm(@ModelAttribute("user")User user,Model model) {
		boolean status=service.RegisterUser(user);
		if(status) {
			model.addAttribute("success", "User registerd Successfully");
			
		}
		else {
			model.addAttribute("errorMsg", "User not registerd ");
			
		}
		return "registration";
		
	}
	@GetMapping("/loginPage")
	public String openLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
		
	}


}
