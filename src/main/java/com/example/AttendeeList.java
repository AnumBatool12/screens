package com.example;

import java.util.ArrayList;

public class AttendeeList {
	private ArrayList<Attendee> attendees;
	private Integer totalAttendees;

	AttendeeList(){//constructor
		attendees=new ArrayList<Attendee>();
		totalAttendees=0;
	}

	//getters
	public String getName(int index){return attendees.get(index).getName();}
    public String getPhone(int index) {return attendees.get(index).getPhone();}
    public String getEmail(int index) {return attendees.get(index).getEmail();}
    public Boolean getAttendingStatus(int index){return attendees.get(index).getAttendingStatus();}
	public Integer getTotal(){return totalAttendees;}
	public int getID(int index){return attendees.get(index).getID();}

	//setters
	public void createAttendee(String name, String phone, String mail, Boolean att){
		Attendee newAttendee=new Attendee(name, phone, mail);
		newAttendee.setAttending(att);
		attendees.add(newAttendee);
		totalAttendees++;
	}
	public void addAttendee(Attendee add){
		attendees.add(add);
	}

	public void setName(int index, String name){attendees.get(index).setName(name);}
	public void setPhone(int index, String ph){attendees.get(index).setPhone(ph);}
	public void setEmail(int index, String mail){attendees.get(index).setEmail(mail);}
	public void setStatus(int index, Boolean stat){attendees.get(index).setAttending(stat);}
	public void setID(int id, int index){attendees.get(index).setID(id);}

	public void removeAttendee(int index){attendees.remove(index);}
}