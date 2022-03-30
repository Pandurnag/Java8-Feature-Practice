package com.javaguides.java.tutorial;

import java.util.ArrayList;
import java.util.List;

public class StreamMapCollectExample {

	public static void main(String[] args) {
		
		
		
	

	}

}
class UserDTO{
	private int id;
	private String userName;
	private String email;
	


public UserDTO(int id, String userName, String email){
	super();
	this.id = id;
	this.userName = userName;
	this.email = email;
	
	
}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + userName +  ", email=" + email + "]";
	}
	
	
	
}
