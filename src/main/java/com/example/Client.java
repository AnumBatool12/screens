package com.example;
import java.util.ArrayList;
import java.util.Date;
 
//Client Class
public class Client implements User{
	private String fullname;
	private String email;
	private String phoneNo;
	private String username;
	private String password;
	private int UserID;

	//objects of other classes
	private ArrayList<Event> event;
	private Scheduler tdl;//To Do List

	Client(){
		event=new ArrayList<Event>();
		tdl=new Scheduler();
	}

	Client(String name, String mail, String phone, String usn, String pw){//parametrised constructor
		fullname=name;
		email=mail;
		phoneNo=phone;
		username=usn;
		password=pw;

		event=new ArrayList<Event>();
		tdl=new Scheduler();
	} 

	Client(String name, String mail, String phone, String usn, String pw, int id, ArrayList<Event> e, Scheduler s){
		fullname=name;
		email=mail;
		phoneNo=phone;
		username=usn;
		password=pw;
		UserID=id;

		event=e;
		tdl=s;
	}

	//Client getter functions
	public String getFullname(){ return fullname;}
	public String getEmailmail() {return email;}
	public String getPhoneNo() {return phoneNo;}
	public String getUsername() {return username;}
	public String getPassword() {return password;}
	public int getUserID() {return UserID;}
	//Client setter Functions
	public void setFullname(String name) {fullname = name;}
	public void setEmail(String mail) {email=mail;}
	public void setPhoneNo(String phone) {phoneNo = phone;}
	public void setUsername (String user){username = user;}
	public void setPassword (String pass){password = pass;} 
	public void setUserID(int ID) {UserID=ID;}

	//Event getter Functions
	public String getEventTitle(int index)	{return event.get(index).getTitle();}
	public Date getEventDate(int index) {return event.get(index).getDate();}
	public String getEventTime(int index) {return event.get(index).getTime();}
	public Integer getEventSize(int index) {return event.get(index).getSize();}
	public String getEventPaymentType(int index) {return event.get(index).getPaymentType();}
	public int getEventID(int index) {return event.get(index).getEventID();}
	//Event Setter Functions
	public void setEventTitle(String title, int Uindex) {event.get(Uindex).setEventTitle(title);}
	public void setEventDate(Date date, int Uindex) {event.get(Uindex).setDate(date);}
	public void setEventTime(String time, int Uindex) {event.get(Uindex).setTime(time);}
	public void setEventSize(Integer size, int Uindex) {event.get(Uindex).setSize(size);}
	public void setEventPaymentType(String type, int Uindex) {event.get(Uindex).setPaymentType(type);}
	public void setEventID(int id, int Uindex) {event.get(Uindex).setEventID(id);}
	public void createNewEvent(String title, Date date, String time, String size, int id) {
		Event newEvent=new Event(title, date, time, size, id);
		event.add(newEvent);
	}
	public void createEventSql(String title, Date date, String time, String size, EventRequirements er, Budget b, AttendeeList al, Invoice in, int id) {
		Event newEvent=new Event(title, date, time, size, er, b, al, in, id);
		event.add(newEvent);
	}

	//Event Requirement getter functions
	public Integer getTotalReqs(int Uindex) { return event.get(Uindex).getTotalReqs();}
	public String getReq(int index, int Uindex) {return event.get(Uindex).getReq(index);}
	public int getReqID(int index, int Uindex) {return event.get(Uindex).getReqID(index);}
	//Event Requirement setter function
	public void createRequirement(String req, int id, int Uindex) {event.get(Uindex).createRequirement(req, id);}
	public void setReq(int index, String req, int Uindex) {event.get(Uindex).setReq(index, req);}
	public void setReqID(int index, int id, int Uindex) {event.get(Uindex).setReqID(index, id);}
	
	//Schedular getter function
	public int getTotalTaskNo() {return tdl.getTotalTaskNo();}
	public Task getTask(int index) {return tdl.getTask(index);}
	public Date gettaskDate(int index) {return tdl.getDate(index);}
	public String getTaskdesc(int index) {return tdl.getTaskdesc(index);}
	public String getTaskStat(int index) {return tdl.getStat(index);}
	public int getScheduleID(int index) {return tdl.getID(index);}
	//Schedular setter function
	public void setDate(int index, Date date) {tdl.setDate(index, date);}
	public void setTask(int index, String task) {tdl.setTask(index, task);}
	public void setAll(int index, String task, Date date) {tdl.setAll(index, task, date);}
	public void setStatus(int index, String stat) {tdl.setStatus(index, stat);}
	public void addTask(Task task) {tdl.addTask(task);}
	public void allNewTask(String task, Date date) {tdl.allNewTask(task, date);}

	//Attendee List getter functions
	public String getAttendeeName(int index, int Uindex) {return event.get(Uindex).getName(index);}
	public String getAttendeePhone(int index, int Uindex) {return event.get(Uindex).getPhone(index);}
	public String getAttendeeEmail(int index, int Uindex) {return event.get(Uindex).getEmail(index);}
	public Boolean getAttendingStatus(int index, int Uindex) {return event.get(Uindex).getAttendingStatus(index);}
	public Integer getTotalAttendee(int Uindex) {return event.get(Uindex).getTotalAttendee();}
	public int geAttendeetID(int index, int Uindex) {return event.get(Uindex).geAttendeetID(index);}
	//Attendee List Setter Functions
	public void createAttendee(String name, String phone, String mail, Boolean att, int Uindex) {event.get(Uindex).createAttendee(name, phone, mail, att);}
	public void addAttendee(Attendee add, int Uindex) {event.get(Uindex).addAttendee(add);}
	public void setAttendeeName(int index, String name, int Uindex) {event.get(Uindex).setAttendeeName(index, name);}
	public void setAttendeePhone(int index, String ph, int Uindex) {event.get(Uindex).setAttendeePhone(index, ph);}
	public void setAttendeeEmail(int index, String mail, int Uindex) {event.get(Uindex).setAttendeeEmail(index, mail);}
	public void setAttendeeStatus(int index, Boolean stat, int Uindex) {event.get(Uindex).setAttendeeStatus(index, stat);}
	public void setAttendeeID(int id, int index, int Uindex) {event.get(Uindex).setAttendeeID(id, index);}

	//Budget getter function
	public Integer getTotalItemBudget(int Uindex) {return event.get(Uindex).getTotalItemBudget();}
	public String getDescBudget(int index, int Uindex) {return event.get(Uindex).getDescBudget(Uindex);}
	public double getPortion(int index, int Uindex) {return event.get(Uindex).getPortion(index);}
	public double getSpent(int index, int Uindex) {return event.get(Uindex).getSpent(index);}
	public double getBudgetTotal(int Uindex) {return event.get(Uindex).getTotal();}
	public int getBudegtID(int index, int Uindex) {return event.get(Uindex).getBudegtID(index);}
	//Budget setter function
	public void createBudgetItem(String desc, double portion, double sp, int id, int Uindex) {event.get(Uindex).createBudgetItem(desc, portion, sp, id);}
	public void setBudgetDesc(int index, String desc, int Uindex) {event.get(Uindex).setDesc(index, desc);}
	public void setPortion(int index, double portion, int Uindex) {event.get(Uindex).setPortion(index, portion);}
	public void setSpent(int index, double sp, int Uindex) {event.get(Uindex).setSpent(index, sp);}
	public void setBudgetID(int id, int index, int Uindex) {event.get(Uindex).setBudgetID(id, index);}
	public double calCulateTotalSpent(int Uindex) {return event.get(Uindex).calCulateTotalSpent();}
	public Boolean overBudget(int Uindex) {return event.get(Uindex).overBudget();}

	//Payment Getter funcctions only
	public Integer getTotalItem(int Uindex) {return event.get(Uindex).getPaymentTotalItem();}
	public String getInvoiceDesc(int index, int Uindex) {return event.get(Uindex).getDesc(index);}
	public double getAmount(int index, int Uindex) {return event.get(Uindex).getAmount(index);}
	public double getTotalPayment(int Uindex) {return event.get(Uindex).getTotalPayment();}
	public int getPaymentID(int index, int Uindex) {return event.get(Uindex).getPaymentID(index);}

	//removers
	public void removeAttendee(int index, int Uindex) {event.get(Uindex).removeAttendee(index);}
	public void removeBudgetItem(int index, int Uindex) {event.get(Uindex).removeBudgetItem(index);}
	public void removeRequirement(int index, int Uindex) {event.get(Uindex).removeReq(Uindex);}
	public void removeTask(int index) {tdl.removeTask(index);}
	public void removeEvent(int index){event.remove(index);}
}