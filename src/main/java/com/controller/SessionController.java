package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SessionController {

	//jsp load method - url  

	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String  signup() {
		return "Signup"; //Signup -> jsp name 
	}
	
	//
	
	//
	
	//
	
}

//3 servlet 
//Signup
//Login
//ForgetPassword 



//1 controller --  3 method 