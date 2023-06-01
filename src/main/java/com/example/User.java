package com.example;

import java.util.Date;

//User Class
public interface User {
	public void setFullname (String name);
	public void setEmail(String mail);
	public void setPhoneNo(String phone);
	public void setUsername (String user);
	public void setPassword (String pass);
	public void setUseID(int ID);
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
	public String getTitle();
	public Date getDate();
	public String getTime();
	public Integer getSize();
	public String getPaymentType();
	public int getEventID();
	//Event Requirements
	public Integer getTotalReqs();
	public String getReq(int index);
	public int getReqID(int index);
	//Budget
	public Integer getTotalItemBudget();
	public String getDescBudget(int index);
	public double getPortion(int index);
	public double getSpent(int index);
	public double getTotal();
	public int getBudegtID(int index);
	//Attendee List
	public String getName(int index);
    public String getPhone(int index);
    public String getEmail(int index);
    public Boolean getAttendingStatus(int index);
	public Integer getTotalAttendee();
	public int geAttendeetID(int index);
	//Invoice
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
	public void setEventTitle(String title);
	public void setDate(Date date);
	public void setTime(String time);
	public void setSize (Integer size);
	public void setPaymentType(String type);
	public void setEventID(int id);
	//ER
	public void createRequirement(String req, int id);
	public void setReq(int index, String req);
	public void setReqID(int index, int id);
	//Budget
	public void createBudgetItem(String desc, double portion, double sp, int id);
	public void setDesc(int index, String desc);
	public void setPortion(int index, double portion);
	public void setSpent(int index, double sp);
	public void setBudgetID(int id, int index);
	public double calCulateTotalSpent();
	public Boolean overBudget();
	//Attendee List
	public void createAttendee(String name, String phone, String mail, Boolean att);
	public void addAttendee(Attendee add);
	public void setAttendeeName(int index, String name);
	public void setAttendeePhone(int index, String ph);
	public void setAttendeeEmail(int index, String mail);
	public void setAttendeeStatus(int index, Boolean stat);
	public void setAttendeeID(int id, int index);
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
	public void removeAttendee(int index);
	public void removeBudgetItem(int index);
	public void removePayment(int index);
	public void removeRequirement(int index);
	public void removeRequest(int index);
	public void getRidOFRejectRequest();
	public void removeTask(int index);
}