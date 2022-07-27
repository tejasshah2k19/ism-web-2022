package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository // spring.xml map -> spring bean
public class UserDao {

	@Autowired // spring.xml or stereotype annotation
	JdbcTemplate stmt;

	public void addUser(UserBean user) {
		stmt.update("insert into users (firstname,lastname,gender,email,password,usertype) values (?,?,?,?,?,?)",
				user.getFirstName(), user.getLastName(), user.getGender(), user.getEmail(), user.getPassword(),
				user.getUserType());
	}
}
