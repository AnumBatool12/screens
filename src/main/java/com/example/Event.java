package com.example;
/*Event Class*/

import java.time.LocalDate;

public class Event {

	//basic variables
	private String eventTitle;
	private LocalDate eventDate;
	private  String eventTime;
	private Integer eventSize;
	private String paymentType;

	//variables of other classes-->add them separately as well
	private EventRequirements ER;
	private Budget B;
	private AttendeeList AL;
	private Invoice invoice;

	Event(){//Default COnstructor
		eventTitle="Event";
		paymentType="Cash";
		ER=new EventRequirements();
		B=new Budget();
		AL=new AttendeeList(); 
		invoice=new Cash();
	}

	Event(String title, LocalDate date, String time, String size){//parametrised constructor
		eventTitle=title;
		eventDate=date;
		eventTime=time;
		paymentType="Cash";

		eventSize=Integer.valueOf(size);
		ER=new EventRequirements();
		B=new Budget();
		AL=new AttendeeList(); 
		invoice=new Cash();
	}

	Event(String title, LocalDate date, String time, String size, String pT){//parametrised constructor
		eventTitle=title;
		eventDate=date;
		eventTime=time;
		paymentType=pT;

		eventSize=Integer.valueOf(size);
		ER=new EventRequirements();
		B=new Budget();
		AL=new AttendeeList(); 
		if (paymentType.equals("Cash")){
			invoice=new Cash();
		}
	}

	Event(String title, LocalDate date, String time, String size, EventRequirements er, Budget b, AttendeeList al, Invoice in){//parametrised constructor
		eventTitle=title;
		eventDate=date;
		eventTime=time;
		eventSize=Integer.valueOf(size);

		ER=er;
		B=b;
		AL=al; 
		invoice=in;
	}

	//getter functions
	public String getTitle() {return eventTitle;}
	public LocalDate getDate() {return eventDate;}
	public String getTime() {return eventTime;}
	public Integer getSize() {return eventSize;}
	public String getPaymentType() {return paymentType;}
	//ER
	public Integer getTotalReqs(){return ER.getTotalReqs();}
	public String getReq(int index) {return ER.getReq(index);}
	public int getReqID(int index){return ER.getReqID(index);}
	//Budget
	public Integer getTotalItemBudget() {return B.getTotalItem();}
	public String getDescBudget(int index) {return B.getDesc(index);}
	public double getPortion(int index) {return B.getPortion(index);}
	public double getSpent(int index) {return B.getSpent(index);}
	public double getTotal() {return B.getTotalBudget();}
	public int getBudegtID(int index) {return B.getID(index);}
	//Attendee List
	public String getName(int index){return AL.getName(index);}
    public String getPhone(int index) {return AL.getPhone(index);}
    public String getEmail(int index) {return AL.getEmail(index);}
    public Boolean getAttendingStatus(int index){return AL.getAttendingStatus(index);}
	public Integer getTotalAttendee(){return AL.getTotal();}
	public int geAttendeetID(int index){return AL.getID(index);}
	//Invoice
	public Integer getTotalItem(){return invoice.getTotalItem();}
	public String getDesc(int index){return invoice.getDesc(index);}
	public double getAmount(int index){return invoice.getAmount(index);}
	public double getTotalPayment(){return invoice.getTotal();}
    public int getPaymentID(int index){return invoice.getID(index);}

	//setter functions
	public void setEventTitle(String title)	{eventTitle=title;}
	public void setDate(LocalDate date) {eventDate=date;}
	public void setTime(String time) {eventTime=time;}
	public void setSize (Integer size) {eventSize=size;}
	public void setPaymentType(String type) {paymentType=type;}
	//ER
	public void createRequirement(String req, int id){ER.createRequirement(req, id);}
	public void setReq(int index, String req) {ER.setReq(index, req);}
	public void setReqID(int index, int id){ER.setID(index, id);}
	//Budget
	public void createBudgetItem(String desc, double portion, double sp, int id){
		B.createBudgetItem(desc, portion, sp, id);
	}
	public void setDesc(int index, String desc) {B.setDesc(index, desc);}
	public void setPortion(int index, double portion) {B.setPortion(index, portion);}
	public void setSpent(int index, double sp) {B.setSpent(index, sp);}
	public void setBudgetID(int id, int index){B.setID(id, index);}
	public double calCulateTotalSpent(){return B.calCulateTotalSpent();}
	public Boolean overBudget(){return B.overBudget(); }
	//Attendee List
	public void createAttendee(String name, String phone, String mail, Boolean att){
		AL.createAttendee(name, phone, mail, att);
	}
	public void addAttendee(Attendee add){ AL.addAttendee(add);}
	public void setAttendeeName(int index, String name){AL.getName(index);}
	public void setAttendeePhone(int index, String ph){AL.getPhone(index);}
	public void setAttendeeEmail(int index, String mail){AL.getEmail(index);}
	public void setAttendeeStatus(int index, Boolean stat){AL.getAttendingStatus(index);}
	public void setAttendeeID(int id, int index){AL.setID(id, index);}
	//Invoice
	public void createPaymentItem(String desc, double amt, int id){invoice.createPaymentItem(desc, amt, id);}
	public void setPaymentDesc(int index, String desc){invoice.setDesc(index, desc);}
	public void setAmount(int index, double amt){invoice.setAmount(index, amt);}
	public void setPaymentID(int id, int index) {invoice.setID(id, index);}
	public double calculatePaymentTotal(){return invoice.calCulateTotal();}
}