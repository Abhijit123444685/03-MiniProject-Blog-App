package com.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ait.entity.formbinding.LoginForm;
import com.ait.entity.formbinding.RegistraionForm;
import com.ait.serviceImpl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping("/register")
	public String registerUser(Model model) {
		RegistraionForm form=new RegistraionForm();
		
		model.addAttribute("user",form);
		
		return "register";
		
	}
	@PostMapping("/register")
	public String register(@ModelAttribute("user")   RegistraionForm form,  Model model) {
		
		boolean getUser = userService.registerUser(form);
		if(getUser) {
			model.addAttribute("succ","Registration success");
		}else {
			model.addAttribute("err","Something Went Wrong");
		}
		
		return "register";
		
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		 LoginForm form=new LoginForm();
		 model.addAttribute("userLogin",form);
		 return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(@ModelAttribute("userLogin")  LoginForm form , Model model) {
		boolean login = userService.login(form);
		
		if(login) {
			model.addAttribute("succ","login success");
		}else {
			model.addAttribute("err","check your credentials");
		}
		 return "login";
	}

}
