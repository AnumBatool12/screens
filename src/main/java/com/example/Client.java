package com.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

//Client Class
public class Client implements User{
	private String fullname;
	private String email;
	private String phoneNo;
	private String username;
	private String password;

	private ArrayList<Event> events;

	Client(){
		//initialize the array of clients
		events=new ArrayList<Event>();
	}

	Client(String name, String mail, String phone, String usn, String pw){//parametrised constructor
		fullname=name;
		email=mail;
		phoneNo=phone;
		username=usn;
		password=pw;

		//initialize the array of clients
		events=new ArrayList<Event>();
		System.out.println("I made the client");
	}

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

	public void getUserSummary() {}

	//creating new Event
	public void createEvent(String title, LocalDate date, String time, String size) {
		Event newEvent=new Event(title, date, time, size);
		events.add(newEvent);
	}

	public void createEventRequirements() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void createInvite() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void createBudget(Integer budget) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void createBudgetItemList() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void addBudgetItem(Object itemName, Object budgetPortion) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void updateMoneySpent(Object itemName, Object mSpent) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void PaymentEvent() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}