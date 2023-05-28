package com.example;
import java.util.Date;

//User Class
public interface User {
	public void setFullname (String name);
	public void setEmail(String mail);
	public void setPhoneNo(String phone);
	public void setUsername (String user);
	public void setPassword (String pass);
	public String getFullname();
	public String getEmailmail();
	public String getPhoneNo();
	public String getUsername();
	public String getPassword();
	public void getUserSummary();
	public void createEvent(String location, Date date, String time, Integer size);
	public void createEventRequirements();
	public void createInvite();
	public void createBudget(Integer budget);
	public void createBudgetItemList();
	public void addBudgetItem(Object itemName, Object budgetPortion);
	public void updateMoneySpent(Object itemName, Object mSpent);
	public void PaymentEvent();
}