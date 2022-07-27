package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.SecQuestionAnsBean;

@Repository
public class SecQuestionAnsDao {

	@Autowired
	JdbcTemplate stmt;

	public void addQuestion(SecQuestionAnsBean ansBean) {
		stmt.update("insert into secquestionans (question,ans,userid) values (?,?,?)", ansBean.getQuestion(),
				ansBean.getAns(), ansBean.getUserId());
	}
}
