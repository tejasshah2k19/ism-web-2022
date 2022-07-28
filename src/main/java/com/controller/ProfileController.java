package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bean.SecQuestionAnsBean;
import com.bean.UserBean;
import com.dao.SecQuestionAnsDao;

@Controller
public class ProfileController {

	@Autowired
	SecQuestionAnsDao ansDao;

	@GetMapping("/setsecquestion")
	public String setSecQuestionAns(HttpSession session, Model model) {
		UserBean user = (UserBean) session.getAttribute("user");
		List<SecQuestionAnsBean> allQuestions = ansDao.getQuestionByUser(user.getUserId());
		model.addAttribute("allQuestions", allQuestions);
		return "SetSecQuestionAns";
	}

	@PostMapping("/savequestionans")
	public String saveQuestionAns(SecQuestionAnsBean ansBean, HttpSession session, Model model) {

		UserBean user = (UserBean) session.getAttribute("user");
		ansBean.setUserId(user.getUserId());
		ansDao.addQuestion(ansBean);

		model.addAttribute("msg", "question added");
		return "Home";
	}

	@GetMapping("/newprofile")
	public String newProfile() {
		return "NewProfile";
	}

	@PostMapping("/saveprofile")
	public String saveProfile(@RequestParam("profile") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		return "NewProfile";
	}

}
