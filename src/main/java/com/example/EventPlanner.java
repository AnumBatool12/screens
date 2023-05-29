package com.example;
import java.time.LocalDate;
import java.util.Date;

/**
 * 
 */

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

	public void getUserSummary() {}

	public void createEvent(String title, LocalDate date, String time, String size) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
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
	public void request() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}