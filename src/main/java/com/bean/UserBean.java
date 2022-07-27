package com.bean;

import org.hibernate.validator.constraints.NotBlank;

public class UserBean {

	Integer userId;

	@NotBlank(message = "Please Enter FirstName")
	String firstName;

	@NotBlank(message = "Please Enter Email")
	String email;

	@NotBlank(message = "Please Enter Password")
	String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
