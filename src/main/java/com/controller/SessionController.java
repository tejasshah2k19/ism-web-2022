package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserBean;

 
 
@Controller
public class SessionController {

	// jsp load method - url

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {
		return "Signup"; // Signup -> jsp name
	}

	//
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveUser(@Valid UserBean userBean, BindingResult result) {
		System.out.println("SaveUser called.....");
		System.out.println(result);
		if (result.hasErrors()) {// true == error
			return "Signup";
		} else {
			System.out.println(userBean.getFirstName());
			System.out.println(userBean.getEmail());
			return "Login";
		}
	}

	//

	//

}

//3 servlet 
//Signup
//Login
//ForgetPassword 

//1 controller --  3 method 