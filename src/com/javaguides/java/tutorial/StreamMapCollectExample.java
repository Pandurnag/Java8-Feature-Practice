package com.javaguides.java.tutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class StreamMapCollectExample {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"Ramesh","secrete","ramesh@gmail.com"));
		users.add(new User(1,"Tony","secrete","tony@gmail.com"));
		users.add(new User(1,"Tom","secrete","tom@gmail.com"));
	
		List<UserDTO> userDTO = new ArrayList<UserDTO>();
		for (User user : users) {
			
			userDTO.add(new UserDTO(user.getId, user.getUserName(), user.getmail()));
			
			
		}
		for (UserDTO dto : userDTO) {
			System.out.println(dto);
			
		}
		
		// using stream().map()
		
		
			
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
