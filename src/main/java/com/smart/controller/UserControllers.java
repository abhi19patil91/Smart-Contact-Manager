package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class UserControllers {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/")
	public String home(){
		
		return "home";
	}
	
	@RequestMapping("/signup")
	public String signup(){
		
		return "signup";
	}

}
