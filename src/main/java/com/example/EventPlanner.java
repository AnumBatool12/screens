package com.example;

import java.util.Date;

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
	@Override
	public void setUserID(int ID) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setUserID'");
	}
	@Override
	public int getUserID() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getUserID'");
	}
	@Override
	public void createNewEvent(String title, Date date, String time, String size, int id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createNewEvent'");
	}
	@Override
	public void createEventSql(String title, Date date, String time, String size, EventRequirements er, Budget b,
			AttendeeList al, Invoice in, int id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createEventSql'");
	}
	@Override
	public String getEventTitle(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getEventTitle'");
	}
	@Override
	public Date getEventDate(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getEventDate'");
	}
	@Override
	public String getEventTime(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getEventTime'");
	}
	@Override
	public Integer getEventSize(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getEventSize'");
	}
	@Override
	public String getEventPaymentType(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getEventPaymentType'");
	}
	@Override
	public int getEventID(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getEventID'");
	}
	@Override
	public Integer getTotalReqs(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTotalReqs'");
	}
	@Override
	public String getReq(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getReq'");
	}
	@Override
	public int getReqID(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getReqID'");
	}
	@Override
	public Integer getTotalItemBudget(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTotalItemBudget'");
	}
	@Override
	public String getDescBudget(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getDescBudget'");
	}
	@Override
	public double getPortion(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getPortion'");
	}
	@Override
	public double getSpent(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getSpent'");
	}
	@Override
	public double getBudgetTotal(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getBudgetTotal'");
	}
	@Override
	public int getBudegtID(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getBudegtID'");
	}
	@Override
	public String getAttendeeName(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAttendeeName'");
	}
	@Override
	public String getAttendeePhone(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAttendeePhone'");
	}
	@Override
	public String getAttendeeEmail(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAttendeeEmail'");
	}
	@Override
	public Boolean getAttendingStatus(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAttendingStatus'");
	}
	@Override
	public Integer getTotalAttendee(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTotalAttendee'");
	}
	@Override
	public int geAttendeetID(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'geAttendeetID'");
	}
	@Override
	public Integer getTotalItem(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTotalItem'");
	}
	@Override
	public String getDesc(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getDesc'");
	}
	@Override
	public double getAmount(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAmount'");
	}
	@Override
	public double getTotalPayment(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTotalPayment'");
	}
	@Override
	public int getPaymentID(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getPaymentID'");
	}
	@Override
	public boolean getStatus(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getStatus'");
	}
	@Override
	public int getReqNum(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getReqNum'");
	}
	@Override
	public double getLimit(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getLimit'");
	}
	@Override
	public int getID(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getID'");
	}
	@Override
	public Request getRequest(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getRequest'");
	}
	@Override
	public int getTotalTaskNo() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTotalTaskNo'");
	}
	@Override
	public Task getTask(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTask'");
	}
	@Override
	public Date gettaskDate(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'gettaskDate'");
	}
	@Override
	public String getTaskdesc(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTaskdesc'");
	}
	@Override
	public String getTaskStat(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTaskStat'");
	}
	@Override
	public int getScheduleID(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getScheduleID'");
	}
	@Override
	public void setEventTitle(String title, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setEventTitle'");
	}
	@Override
	public void setEventDate(Date date, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setEventDate'");
	}
	@Override
	public void setEventTime(String time, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setEventTime'");
	}
	@Override
	public void setEventSize(Integer size, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setEventSize'");
	}
	@Override
	public void setEventPaymentType(String type, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setEventPaymentType'");
	}
	@Override
	public void setEventID(int id, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setEventID'");
	}
	@Override
	public void createRequirement(String req, int id, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createRequirement'");
	}
	@Override
	public void setReq(int index, String req, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setReq'");
	}
	@Override
	public void setReqID(int index, int id, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setReqID'");
	}
	@Override
	public void createBudgetItem(String desc, double portion, double sp, int id, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createBudgetItem'");
	}
	@Override
	public void setBudgetDesc(int index, String desc, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setBudgetDesc'");
	}
	@Override
	public void setPortion(int index, double portion, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setPortion'");
	}
	@Override
	public void setSpent(int index, double sp, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setSpent'");
	}
	@Override
	public void setBudgetID(int id, int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setBudgetID'");
	}
	@Override
	public double calCulateTotalSpent(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'calCulateTotalSpent'");
	}
	@Override
	public Boolean overBudget(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'overBudget'");
	}
	@Override
	public void createAttendee(String name, String phone, String mail, Boolean att, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createAttendee'");
	}
	@Override
	public void addAttendee(Attendee add, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addAttendee'");
	}
	@Override
	public void setAttendeeName(int index, String name, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setAttendeeName'");
	}
	@Override
	public void setAttendeePhone(int index, String ph, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setAttendeePhone'");
	}
	@Override
	public void setAttendeeEmail(int index, String mail, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setAttendeeEmail'");
	}
	@Override
	public void setAttendeeStatus(int index, Boolean stat, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setAttendeeStatus'");
	}
	@Override
	public void setAttendeeID(int id, int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setAttendeeID'");
	}
	@Override
	public void createPaymentItem(String desc, double amt, int id, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createPaymentItem'");
	}
	@Override
	public void setPaymentDesc(int index, String desc, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setPaymentDesc'");
	}
	@Override
	public void setAmount(int index, double amt, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setAmount'");
	}
	@Override
	public void setPaymentID(int id, int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setPaymentID'");
	}
	@Override
	public double calculatePaymentTotal(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'calculatePaymentTotal'");
	}
	@Override
	public void createRequest(Request r, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createRequest'");
	}
	@Override
	public void setRequestStatus(Boolean stat, int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setRequestStatus'");
	}
	@Override
	public void setRequestNum(int num, int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setRequestNum'");
	}
	@Override
	public void setReuqestID(int id, int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setReuqestID'");
	}
	@Override
	public void setRequestLimit(double spend, int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setRequestLimit'");
	}
	@Override
	public void setDate(int index, Date date) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setDate'");
	}
	@Override
	public void setTask(int index, String task) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setTask'");
	}
	@Override
	public void setAll(int index, String task, Date date) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setAll'");
	}
	@Override
	public void setStatus(int index, String stat) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
	}
	@Override
	public void addTask(Task task) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addTask'");
	}
	@Override
	public void allNewTask(String task, Date date) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'allNewTask'");
	}
	@Override
	public void removeAttendee(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeAttendee'");
	}
	@Override
	public void removeBudgetItem(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeBudgetItem'");
	}
	@Override
	public void removePayment(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removePayment'");
	}
	@Override
	public void removeRequirement(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeRequirement'");
	}
	@Override
	public void removeRequest(int index, int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeRequest'");
	}
	@Override
	public void getRidOFRejectRequest(int Uindex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getRidOFRejectRequest'");
	}
	@Override
	public void removeTask(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeTask'");
	}
	

	
}