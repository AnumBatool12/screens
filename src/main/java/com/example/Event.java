package com.example;
/*Event Class*/

import java.time.LocalDate;

public class Event {
	private String eventTitle;
	private LocalDate eventDate;
	private  String eventTime;
	private Integer eventSize;

	Event(){//Default COnstructor
		eventTitle="Event";
	}

	Event(String title, LocalDate date, String time, String size){//parametrised constructor
		eventTitle=title;
		eventDate=date;
		eventTime=time;
		eventSize=Integer.valueOf(size);
		System.out.println("Im here");
	}

	//setter functions
	public void setEventTitle(String title)	{eventTitle=title;}
	public void setDate(LocalDate date) {eventDate=date;}
	public void setTime(String time) {eventTime=time;}
	public void setSize (Integer size) {eventSize=size;}

	//getter functions
	public String getTitle() {return eventTitle;}
	public LocalDate getDate() {return eventDate;}
	public String getTime() {return eventTime;}
	public Integer getSize() {return eventSize;}



	public void getEventSummary() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void updateRequirements(Object reqs) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	public void createEvent(Object location, Object date, Object time, Object size) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	public void createRequirements() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void createInvite() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	public void createBudget(Object budget) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void createBudgetList() {
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

	public void Pay() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}