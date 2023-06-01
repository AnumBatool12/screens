package com.example;
import java.time.LocalDate;
import java.util.ArrayList;
 
//Client Class
public class Client implements User{
	private String fullname;
	private String email;
	private String phoneNo;
	private String username;
	private String password;

	//objects of other classes
	private ArrayList<Event> event;

	Client(){
		
	}

	Client(String name, String mail, String phone, String usn, String pw){//parametrised constructor
		fullname=name;
		email=mail;
		phoneNo=phone;
		username=usn;
		password=pw;

		event=new ArrayList<Event>();
		
	}

	//setter functions
	public void setFullname(String name) {fullname = name;}
	public void setEmail(String mail) {email=mail;}
	public void setPhoneNo(String phone) {phoneNo = phone;}
	public void setUsername (String user){username = user;}
	public void setPassword (String pass){password = pass;}

	//getter functions
	public String getFullname(){ return fullname;}
	public String getEmailmail() {return email;}
	public String getPhoneNo() {return phoneNo;}
	public String getUsername() {return username;}
	public String getPassword() {return password;}


	//creating new Event
	public void createEvent(String title, LocalDate date, String time, String size) {
		
	}
	
}