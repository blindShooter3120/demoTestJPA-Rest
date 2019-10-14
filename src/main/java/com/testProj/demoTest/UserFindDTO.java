package com.testProj.demoTest;

import java.util.UUID;

public class UserFindDTO {

	private UUID id;

    private String firstName;

    private String lastname;

    private String email;
    
    private String dob;
    
    private String password;
    
    
    public UserFindDTO(UUID id,String firstName,String lastname,String email,String dob, String password) {
    	
    	this.id=id;
    	this.firstName=firstName;
    	this.lastname=lastname;
    	this.email=email;
    	this.dob=dob;
    	this.password=password;
    	   	
    }
    
    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
