package com.testProj.demoTest;

public class UserCreateDTO {
	
	
	private String user_firstName;
	private String user_lastname;
	private String user_email;
	private String user_dob;
	private String user_password;
	
	
	
	public String getUser_firstName() {
		return user_firstName;
	}
	public void setUser_firstName(String user_firstName) {
		this.user_firstName = user_firstName;
	}
	public String getUser_lastname() {
		return user_lastname;
	}
	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_dob() {
		return user_dob;
	}
	public void setUser_dob(String user_dob) {
		this.user_dob = user_dob;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "UserCreateDTO {user_firstName=" + user_firstName + ", user_lastname="
				+ user_lastname + ", user_email=" + user_email + ", user_dob=" + user_dob + ", user_password="
				+ user_password + "}";
	} 
	

}
