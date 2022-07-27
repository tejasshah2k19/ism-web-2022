package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.SecQuestionAnsBean;
import com.bean.UserBean;
import com.dao.SecQuestionAnsDao;

@Controller
public class ProfileController {

	@Autowired
	SecQuestionAnsDao ansDao;

	@GetMapping("/setsecquestion")
	public String setSecQuestionAns() {
		return "SetSecQuestionAns";
	}

	@PostMapping("/savequestionans")
	public String saveQuestionAns(SecQuestionAnsBean ansBean, HttpSession session, Model model) {

		UserBean user = (UserBean) session.getAttribute("user");
		ansBean.setUserId(user.getUserId());
		ansDao.addQuestion(ansBean);

		model.addAttribute("msg","question added");
		return "Home";
	}
}
