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

	//Event Related Functions
	//Event-->Getter (Setter is only for Client)
	public String getEventTitle(int index);
	public Date getEventDate(int index);
	public String getEventTime(int index);
	public Integer getEventSize(int index);
	public String getEventPaymentType(int index);
	public int getEventID(int index);

	//Event Requirements-->Getter
	public Integer getTotalReqs(int Uindex);
	public String getReq(int index, int Uindex);
	public int getReqID(int index, int Uindex);
	//-->Setter
	public void createRequirement(String req, int id, int Uindex);
	public void setReq(int index, String req, int Uindex);
	public void setReqID(int index, int id, int Uindex);

	//Schedular-->Getter
	public int getTotalTaskNo();
	public Task getTask(int index);
	public Date gettaskDate(int index);
	public String getTaskdesc(int index);
	public String getTaskStat(int index);
	public int getScheduleID(int index);
	//-->Setter
	public void setDate(int index, Date date);
	public void setTask(int index, String task);
	public void setAll(int index, String task, Date date);
	public void setStatus(int index, String stat);
	public void addTask(Task task);
	public void allNewTask(String task, Date date);

	//Attendee List-->Getter
	public String getAttendeeName(int index, int Uindex);
    public String getAttendeePhone(int index, int Uindex);
    public String getAttendeeEmail(int index, int Uindex);
    public Boolean getAttendingStatus(int index, int Uindex);
	public Integer getTotalAttendee(int Uindex);
	public int geAttendeetID(int index, int Uindex);
	//-->setter
	public void createAttendee(String name, String phone, String mail, Boolean att, int Uindex);
	public void addAttendee(Attendee add, int Uindex);
	public void setAttendeeName(int index, String name, int Uindex);
	public void setAttendeePhone(int index, String ph, int Uindex);
	public void setAttendeeEmail(int index, String mail, int Uindex);
	public void setAttendeeStatus(int index, Boolean stat, int Uindex);
	public void setAttendeeID(int id, int index, int Uindex); 

	//Invoice-->Getter (Setter is for Event Planner Only)
	public Integer getTotalItem(int Uindex);
	public String getInvoiceDesc(int index, int Uindex);
	public double getAmount(int index, int Uindex);
	public double getTotalPayment(int Uindex);
    public int getPaymentID(int index, int Uindex);
	
	//removers
	public void removeRequirement(int index, int Uindex);
	public void removeAttendee(int index, int Uindex);
	public void removeTask(int index);
}

