package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserBean;

@Controller
public class SessionController {

	// jsp load method - url

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model) {

		UserBean user = new UserBean();
		model.addAttribute("user", user);
		return "Signup"; // Signup -> jsp name
	}

	//
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") @Valid UserBean user, BindingResult result, Model model) {
		System.out.println("SaveUser called.....");
		System.out.println(result);

		if (result.hasErrors()) {// true == error
			model.addAttribute("user", user);
			return "Signup";
		} else {
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