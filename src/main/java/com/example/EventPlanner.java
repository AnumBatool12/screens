package com.example;

import java.util.Date;

public class EventPlanner implements User {
	private String fullname;
	private String email;
	private String phoneNo;
	private String username;
	private String password;
	private String expertise;
	private String experience;
	private Date  EPDate;
	private int UserID;

	private Scheduler tdl;//To Do List
	private RequestList rl;//request List

	EventPlanner(){
		tdl=new Scheduler();
		rl=new RequestList();
	}
	
	EventPlanner(String name, String mail, String phone, String usn, String pw, String expert, String exp, Date d, int id){
		fullname=name;
		email=mail;
		phoneNo=phone;
		username=usn;
		password=pw;
		UserID=id;
		expertise=expert;
		experience=exp;
		EPDate=d;

		tdl=new Scheduler();
		rl=new RequestList();
	}

	EventPlanner(String name, String mail, String phone, String usn, String pw, String expert, String exp, Date d,int id, RequestList r, Scheduler s){
		fullname=name;
		email=mail;
		phoneNo=phone;
		username=usn;
		password=pw;
		UserID=id;
		expertise=expert;
		experience=exp;
		EPDate=d;

		tdl=s;
		rl=r;
	}


	//Event Planner getter functions
	public String getFullname(){ return fullname;}
	public String getEmailmail() {return email;}
	public String getPhoneNo() {return phoneNo;}
	public String getUsername() {return username;}
	public String getPassword() {return password;}
	public int getUserID() {return UserID;}
	public String getExpertise(){return expertise;}
	public String getExperience(){return experience;}
	public Date getStartDate(){return EPDate;}
	//Event Planner setter Function
	public void setFullname(String name) {fullname = name;}
	public void setEmail(String mail) {email=mail;}
	public void setPhoneNo(String phone) {phoneNo = phone;}
	public void setUsername (String user){username = user;}
	public void setPassword (String pass){password = pass;}
	public void setUserID(int ID) {UserID=ID;}
	public void setExpertise(String exp){expertise=exp;}
	public void setExperience(String exp){experience=exp;}
	public void setStartDate(Date d){EPDate=d;}

	//Event getter function
	public String getEventTitle(int index){return rl.getTitle(index);}
	public Date getEventDate(int index){return rl.getDate(index);}
	public String getEventTime(int index){return rl.getTime(index);}
	public Integer getEventSize(int index){return rl.getSize(index);}
	public String getEventPaymentType(int index){return rl.getPaymentType(index);}
	public int getEventID(int index){return rl.getEventID(index);}

	//Event Requirement getter function
	public Integer getTotalReqs(int Uindex) { return rl.getTotalReqs(Uindex);}
	public String getReq(int index, int Uindex) {return rl.getReq(index, Uindex);}
	public int getReqID(int index, int Uindex) {return rl.getReqID(index, Uindex);}
	//Event Requirement setter function
	public void createRequirement(String req, int id, int Uindex) {rl.createRequirement(req, id, Uindex);}
	public void setReq(int index, String req, int Uindex) {rl.setReq(index, req, Uindex);}
	public void setReqID(int index, int id, int Uindex) {rl.setReqID(index, id, Uindex);}

	//Schedular getter functions
	public int getTotalTaskNo() {return tdl.getTotalTaskNo();}
	public Task getTask(int index) {return tdl.getTask(index);}
	public Date gettaskDate(int index) {return tdl.getDate(index);}
	public String getTaskdesc(int index) {return tdl.getTaskdesc(index);}
	public String getTaskStat(int index) {return tdl.getStat(index);}
	public int getScheduleID(int index) {return tdl.getID(index);}
	//Schedular setter functions
	public void setDate(int index, Date date) {tdl.setDate(index, date);}
	public void setTask(int index, String task) {tdl.setTask(index, task);}
	public void setAll(int index, String task, Date date) {tdl.setAll(index, task, date);}
	public void setStatus(int index, String stat) {tdl.setStatus(index, stat);}
	public void addTask(Task task) {tdl.addTask(task);}
	public void allNewTask(String task, Date date) {tdl.allNewTask(task, date);}

	//Attendee List getter function
	public String getAttendeeName(int index, int Uindex) {return rl.getAttendeeName(index, Uindex);}
	public String getAttendeePhone(int index, int Uindex) {return rl.getAttendeePhone(index, Uindex);}
	public String getAttendeeEmail(int index, int Uindex) {return rl.getAttendeeEmail(index, Uindex);}
	public Boolean getAttendingStatus(int index, int Uindex) {return rl.getAttendingStatus(index, Uindex);}
	public Integer getTotalAttendee(int Uindex) {return rl.getTotalAttendee(Uindex);}
	public int geAttendeetID(int index, int Uindex) {return rl.geAttendeetID(index, Uindex);}
	//Attendee List setter Functions
	public void createAttendee(String name, String phone, String mail, Boolean att, int Uindex) {
		Attendee newAtt=new Attendee();
		newAtt.setAll(name, phone, mail, att);
		rl.addAttendee(newAtt, Uindex);
	}
	public void addAttendee(Attendee add, int Uindex) {rl.addAttendee(add, Uindex);}
	public void setAttendeeName(int index, String name, int Uindex) {rl.setAttendeeName(index, name, Uindex);}
	public void setAttendeePhone(int index, String ph, int Uindex) {rl.setAttendeePhone(index, ph, Uindex);}
	public void setAttendeeEmail(int index, String mail, int Uindex) {rl.setAttendeeEmail(index, mail, Uindex);}
	public void setAttendeeStatus(int index, Boolean stat, int Uindex) {rl.setAttendeeStatus(index, stat, Uindex);}
	public void setAttendeeID(int id, int index, int Uindex) {rl.setAttendeeID(id, index, Uindex);}
	
	//Invoice (Cash Payment) getter function
	public Integer getTotalItem(int Uindex) {return rl.getTotalPaymenetItem(Uindex);}
	public String getInvoiceDesc(int index, int Uindex) {return rl.getInvoiceDesc(index, Uindex);}
	public double getAmount(int index, int Uindex) {return rl.getAmount(index, Uindex);}
	public double getTotalPayment(int Uindex) {return rl.getTotalPayment(Uindex);}
	public int getPaymentID(int index, int Uindex) {return rl.getPaymentID(index, Uindex);}
	//Invoice setter function
	public void createPaymentItem(String desc, double amt, int id, int Uindex) {rl.createPaymentItem(desc, amt, id, Uindex);}
	public void setPaymentDesc(int index, String desc, int Uindex) {rl.setPaymentDesc(index, desc, Uindex);}
	public void setAmount(int index, double amt, int Uindex) {rl.setAmount(index, amt, Uindex);}
	public void setPaymentID(int id, int index, int Uindex) {rl.setPaymentID(id, index, Uindex);}
	public double calculatePaymentTotal(int Uindex) {return rl.calculatePaymentTotal(Uindex);}
	
	//Request getter function
	public boolean getRequestStatus(int index) {return rl.getStatus(index);}
	public int getRequestNum(int index) {return rl.getReqNum(index);}
	public double getRequestLimit(int index) {return rl.getLimit(index);}
	public int getRequestID(int index) {return rl.getID(index);}
	public Request getRequest(int index) {return rl.getRequest(index);}
	//Request setter function
	public void setRequestNum(int num, int Uindex) {rl.setNum(num, Uindex);}
	public void setReuqestID(int id, int Uindex) {rl.setID(id, Uindex);}
	public void setRequestLimit(double spend, int Uindex) {rl.setLimit(spend, Uindex);}
	public void createRequest(Request r) {rl.AddRequest(r);}
	public void setRequestStatus(Boolean stat, int Uindex) {rl.setStatus(stat, Uindex);}

	//removers
	public void removeRequirement(int index, int Uindex) {rl.removeReq(index, Uindex);}
	public void removeAttendee(int index, int Uindex){rl.removeAttendee(index, Uindex);}
	public void removeTask(int index){tdl.removeTask(index);}
	public void removePayment(int index, int Uindex){rl.removePayment(index, Uindex);}
	public void removeRequest(int index) {rl.removeRequest(index);}
	public void getRidOFRejectRequest(int Uindex) {rl.getRidOFRejectRequest();}
}