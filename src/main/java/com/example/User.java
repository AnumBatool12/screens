package com.example;

import java.util.Date;

//User Class
public interface User {
	public void setFullname (String name);
	public void setEmail(String mail);
	public void setPhoneNo(String phone);
	public void setUsername (String user);
	public void setPassword (String pass);
	public void setUserID(int ID);
	public String getFullname();
	public String getEmailmail();
	public String getPhoneNo();
	public String getUsername();
	public String getPassword();
	public int getUserID();
	
	//functions from Event
	//create Event(For Client Only-->Adds to Event List)
	public void createNewEvent(String title, Date date, String time, String size, int id);
	public void createEventSql(String title, Date date, String time, String size, EventRequirements er, Budget b, AttendeeList al, Invoice in, int id);
	//Getter Functions
	//Event
	public String getEventTitle(int index);
	public Date getEventDate(int index);
	public String getEventTime(int index);
	public Integer getEventSize(int index);
	public String getEventPaymentType(int index);
	public int getEventID(int index);
	//Event Requirements
	public Integer getTotalReqs(int Uindex);
	public String getReq(int index, int Uindex);
	public int getReqID(int index, int Uindex);
	//Budget
	public Integer getTotalItemBudget(int Uindex);
	public String getDescBudget(int index, int Uindex);
	public double getPortion(int index, int Uindex);
	public double getSpent(int index, int Uindex);
	public double getBudgetTotal(int Uindex);
	public int getBudegtID(int index, int Uindex);
	//Attendee List
	public String getAttendeeName(int index, int Uindex);
    public String getAttendeePhone(int index, int Uindex);
    public String getAttendeeEmail(int index, int Uindex);
    public Boolean getAttendingStatus(int index, int Uindex);
	public Integer getTotalAttendee(int Uindex);
	public int geAttendeetID(int index, int Uindex);
	//Invoice for Event Planner Only
	public Integer getTotalItem();
	public String getDesc(int index);
	public double getAmount(int index);
	public double getTotalPayment();
    public int getPaymentID(int index);
	//Request List Function(For Event Planner Only)
	public boolean getStatus(int index);
	public int getReqNum(int index);
	public double getLimit(int index);
	public int getID(int index);
	public Request getRequest(int index);
	//Functions for Schedular
	public int getTotalTaskNo();
	public Task getTask(int index);
	public Date gettaskDate(int index);
	public String getTaskdesc(int index);
	public String getTaskStat(int index);
	public int getScheduleID(int index);

	//Setter Functions
	//Event
	public void setEventTitle(String title, int Uindex);
	public void setEventDate(Date date, int Uindex);
	public void setEventTime(String time, int Uindex);
	public void setEventSize (Integer size, int Uindex);
	public void setEventPaymentType(String type, int Uindex);
	public void setEventID(int id, int Uindex);
	//ER
	public void createRequirement(String req, int id, int Uindex);
	public void setReq(int index, String req, int Uindex);
	public void setReqID(int index, int id, int Uindex);
	//Budget
	public void createBudgetItem(String desc, double portion, double sp, int id, int Uindex);
	public void setBudgetDesc(int index, String desc, int Uindex);
	public void setPortion(int index, double portion, int Uindex);
	public void setSpent(int index, double sp, int Uindex);
	public void setBudgetID(int id, int index, int Uindex);
	public double calCulateTotalSpent(int Uindex);
	public Boolean overBudget(int Uindex);
	//Attendee List
	public void createAttendee(String name, String phone, String mail, Boolean att, int Uindex);
	public void addAttendee(Attendee add, int Uindex);
	public void setAttendeeName(int index, String name, int Uindex);
	public void setAttendeePhone(int index, String ph, int Uindex);
	public void setAttendeeEmail(int index, String mail, int Uindex);
	public void setAttendeeStatus(int index, Boolean stat, int Uindex);
	public void setAttendeeID(int id, int index, int Uindex);
	//Invoice
	public void createPaymentItem(String desc, double amt, int id);
	public void setPaymentDesc(int index, String desc);
	public void setAmount(int index, double amt);
	public void setPaymentID(int id, int index);
	public double calculatePaymentTotal();
	//Request
	public void createRequest(Request r);
	public void setRequestStatus(Boolean stat, int index);
    public void setRequestNum(int num, int index);
    public void setReuqestID(int id, int index);
    public void setRequestLimit(double spend, int index);
	//Schedular
	public void setDate(int index, Date date);
	public void setTask(int index, String task);
	public void setAll(int index, String task, Date date);
	public void setStatus(int index, String stat);
	public void addTask(Task task);
	public void allNewTask(String task, Date date); 
	
	//removers
	public void removeAttendee(int index, int Uindex);
	public void removeBudgetItem(int index, int Uindex);
	public void removePayment(int index, int Uindex);
	public void removeRequirement(int index, int Uindex);
	public void removeRequest(int index, int Uindex);
	public void getRidOFRejectRequest(int Uindex);
	public void removeTask(int index);
}