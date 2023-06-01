package com.example;
 


public class EventPlanner implements User {
	private String fullname;
	private String email;
	private String phoneNo;
	private String username;
	private String password;

	public void setFullname(String name) {fullname = name;}
	public void setEmail(String mail) {email=mail;}
	public void setPhoneNo(String phone) {phoneNo = phone;}
	public void setUsername (String user){username = user;}
	public void setPassword (String pass){password = pass;}
	public String getFullname(){ return fullname;}
	public String getEmailmail() {return email;}
	public String getPhoneNo() {return phoneNo;}
	public String getUsername() {return username;}
	public String getPassword() {return password;}
	

	
}