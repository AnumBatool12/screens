package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

//HappenHubController is a singleton
public class HappenHubController {
	private static HappenHubController hhc;//HappenHu's static Variable

	//variable for database
	//MySqlClass database = MySqlClass.getInstance();

	//Variables of other classes
	private Client C;
	private EventPlanner EP;
	private Logistic L;

	//variables to help identify
    private String userType;//Can be Logistic, Event Planner or Client


	//singleton constructor
	private HappenHubController(){}

	public static HappenHubController getInstance(){//get instance
		if (hhc==null){
			hhc=new HappenHubController();
		}
		return hhc;
	}
	
	public void setUserType(String type){userType=type;}
	public String getUserType(){return userType;}

	public void LoadUser(){//Used when user Logs In
		/**
		 * For Whatever Database functions needed here
		 * To load the User and all relevant classes
		 */
	}

	//Sign Up Functions
	//Client Sign UP-->Creating new Client
	public void createClient(String name, String mail, String phone, String usn, String pw){
		C=new Client(name, mail, phone, usn, pw);
		userType="Client";
		//database.signupClient(C);
		/*
		 * Function adds Client to database
		 * Assign Client an ID from here
		 */
	}

	//Event Planner Sign Up-->Creating New Event Planner
	public void createEventPlanner(String name, String mail, String phone, String usn, String pw, String expert, String exp, String dString){
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
		try {
			Date d=formatter.parse(dString);
			EP=new EventPlanner(name, mail, phone, usn, pw, expert, exp, d);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		userType="Event Planner";
		//database.signupEventPlanner(EP);
		/*
		 * Function adds EP to database
		 * Assign EP an ID from here
		 */
	}

	//Logistic Service Sign Up
	public void createLogistic(String name, String type, String usn, String paswd, String url, String email){
		L=new Logistic(name, type, usn, paswd, url, email);
		userType="Logistic";
		//database.signupLogistic(L);
		/*
		 * Function adds Logistic to database
		 * Assign Logistic an ID from here
		 */
	}
	//Sign Up Functions

	//Profile Loader Functions (Getter Functions)
	//Client Get Client functions
	public String getClientName(){return C.getFullname();}
	public String getClientEmail(){return C.getEmailmail();}
	public String getClientPhoneNo(){return C.getPhoneNo();}
	public String getClientUsername(){return C.getUsername();}
	public String getClientPassword(){return C.getPassword();}
	//Client Setter Functions
	public void setClientName(String name){C.setFullname(name);}
	public void setClientEmail(String email){C.setEmail(email);}
	public void setClientPhoneNo(String phone){C.setPhoneNo(phone);}
	public void setUsername(String usn){C.setUsername(usn);}
	public void setPassword(String p){C.setPassword(p);}

	//Event Planner Getter Functions
	public String getEPFullname(){ return EP.getFullname();}
	public String getEPEmailmail() {return EP.getEmailmail();}
	public String getEPPhoneNo() {return EP.getPhoneNo();}
	public String getEPUsername() {return EP.getUsername();}
	public String getEPPassword() {return EP.getPassword();}
	public String getEPExpertise(){return EP.getExperience();}
	public String getEPExperience(){return EP.getExperience();}
	public String getEPStartDate(){
		String date_string = null;
   		SimpleDateFormat str = new SimpleDateFormat("dd/MMM/yyyy");
		date_string = str.format(EP.getStartDate());
		return date_string;
	}
	//Event Planner Setter Functions
	public void setEPFullname(String name) {EP.setFullname(name);}
	public void setEPEmail(String mail) {EP.setEmail(mail);}
	public void setEPPhoneNo(String phone) {EP.setPhoneNo(phone);}
	public void setEPUsername (String user){EP.setUsername(user);}
	public void setEPPassword (String pass){EP.setPassword(pass);}
	public void setEPExpertise(String exp){EP.setExpertise(exp);}
	public void setEPExperience(String exp){EP.setExperience(exp);}
	public void setEPStartDate(Date d){EP.setStartDate(d);}

	//Logistic Service Getter Functions
	public String getCompanyName(){return L.getCompanyName();}
	public String getCompanyType(){return L.getCompanyType();}
	public String getCompanyUserName(){return L.getUserName();}
	public String getCompanyPassword(){return L.getPassword();}
	public String getCompanyDesc(){return L.getCompanyDesc();}
	public String getWebsiteUrl(){return L.getWebsiteUrl();}
	public String getLogisticEmail(){return L.getLogisticEmail();}
	public int getLogID(){return L.getLogID();}
	//Logistic Service Setter Function
	public void setCompanyName(String name) {L.setCompanyName(name);}
	public void setCompanyType(String Type) {L.setCompanyType(Type);}
	public void setCompanyUsername(String un) {L.setUsername(un);}
	public void setCompanyPassword(String pw) {L.setPassword(pw);}
	public void setCompanyDesc(String desc) {L.setCompanyDesc(desc);}
	public void setURL(String url) {L.setURL(url);}
	public void setCompanyEmail(String email){L.setCompanyEmail(email);}
	//Logistic Service Setter Functions

	//creating Event via the Client
	public void createEvent(String title, String Edate, String time, String size) {
		//convert string date to Date
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=formatter.parse(Edate);
		} catch (ParseException e) {e.printStackTrace();}
		int id=C.getEventSize();
		C.createNewEvent(title, date, time, size, id);
		System.out.println(Edate);
	}
	
	//getter functions of event from client
	public String getEventTitle(int index)	{return C.getEventTitle(index);}
	public String getEventDate(int index) {
		String date_string = null;
   		SimpleDateFormat str = new SimpleDateFormat("dd/MMM/yyyy");
		date_string = str.format(C.getEventDate(index));
		return date_string;
	}
	public String getEventTime(int index) {return C.getEventTime(index);}
	public Integer getEventSize(int index) {return C.getEventSize(index);}
	public String getEventSummary(int index){
		String summ="";
		summ+=Integer.toString(index)+". ";
		summ+=getEventTitle(index);
		summ+=" (";
		summ+=getEventSize(index);
		summ+=" people)";
		return summ;
	}

	public Boolean checkIndexEvent(int index){
		return C.checkIndex(index);
	}
	//creating Event via the Client

	//Handling Attendee List
	public void createAttendee(String name, String phone, String mail, Boolean att, int Uindex){
		if (userType.equals("Client")){
			C.createAttendee(name, phone, mail, att, Uindex);
		}
		else if (userType.equals("Event Planner")){
			EP.createAttendee(name, phone, mail, att, Uindex);
		}
	}

	public String getAttendeeSummary(int index, int EventIndex){
		String attendee="";
		if (userType.equals("Client")){
			attendee+=C.geAttendeetID(index, EventIndex)+". ";
			attendee+=C.getAttendeeName(index, EventIndex)+": ";
			attendee+=C.getAttendeeEmail(index, EventIndex)+", ";
			attendee+=C.getAttendeePhone(index, EventIndex)+ " ";
			if (C.getAttendingStatus(index, EventIndex)){
				attendee+="(Attending)";
			}
			else{
				attendee+="(Not Attending)";
			}
		}
		else if (userType.equals("Event Planner")){
			attendee+=EP.geAttendeetID(index, EventIndex)+". ";
			attendee+=EP.getAttendeeName(index, EventIndex)+": ";
			attendee+=EP.getAttendeeEmail(index, EventIndex)+", ";
			attendee+=EP.getAttendeePhone(index, EventIndex)+" ";	
			if (EP.getAttendingStatus(index, EventIndex)){
				attendee+="(Attending)";
			}
			else{
				attendee+="(Not Attending)";
			}
		}
		return attendee;
	}

	public void removeAttendee(int index, int Eindex){
		if (userType.equals("Client")){
			C.removeAttendee(index, Eindex);
		}
		else if (userType.equals("Event Planner")){
			EP.removeAttendee(index, Eindex);
		}
	}

	public Boolean checkIndexAttList(int index, int Eindex){
		if (userType.equals("Client")){
			return C.checkAttendeeIndex(index, Eindex);
		}
		else if (userType.equals("Event Planner")){
			return EP.checkAttendeeIndex(index, Eindex);//Eindex here isrequest no.
		}
		return false;
	}
	//Handling Attendee List

	//Handling Event Requirements
	public void createRequirement(String req, int EventIndex){
		if (userType.equals("Client")){
			int id=C.getTotalReqs(EventIndex);
			C.createRequirement(req, id, EventIndex);
		}
		else if (userType.equals("Event Planner")){
			int id=EP.getTotalReqs(EventIndex);
			EP.createRequirement(req, id, EventIndex);
		}
	}

	public String getRequirementSummary(int index, int EventIndex){
		String req="";
		if (userType.equals("Client")){
			req+=C.getReqID(index, EventIndex)+". ";
			req+=C.getReq(index, EventIndex);
		}
		else if (userType.equals("Event Planner")){
			req+=EP.getReqID(index, EventIndex)+". ";
			req+=EP.getReq(index, EventIndex);
		}
		return req;
	}

	public void removeRequirement(int index, int Eindex){
		if (userType.equals("Client")){
			C.removeRequirement(index, Eindex);
		}
		else if (userType.equals("Event Planner")){
			EP.removeRequirement(index, Eindex);
		}
	}

	public Boolean checkIndexReqList(int index, int Eindex){
		if (userType.equals("Client")){
			return C.RequirementIndex(index, Eindex);
		}
		else if (userType.equals("Event Planner")){
			return EP.RequirementIndex(index, Eindex);//Eindex here isrequest no.
		}
		return false;
	}
	//Handling Event Requirements

	//To-Do list
	public void createTask(String task, String Tdate){
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=formatter.parse(Tdate);
		} catch (ParseException e) {e.printStackTrace();}
		
		if (userType.equals("Client")){
			C.allNewTask(task, date);
		}
		else if (userType.equals("Event Planner")){
			EP.allNewTask(task, date);
		}
		else if (userType.equals("Logistic")){
			L.allNewTask(task, date);
		}
	}

	public String getTaskSummary(int index){
		String task="";
		if (userType.equals("Client")){
			String date_string = null;
			SimpleDateFormat str = new SimpleDateFormat("dd/MMM/yyyy");
			date_string = str.format(C.gettaskDate(index));

			task+=C.getScheduleID(index)+ ". ";
			task+=C.getTaskdesc(index)+ "(";
			task+=date_string+")";
		}
		else if(userType.equals("Event Planner")){
			String date_string = null;
			SimpleDateFormat str = new SimpleDateFormat("dd/MMM/yyyy");
			date_string = str.format(EP.gettaskDate(index));

			task+=EP.getScheduleID(index)+ ". ";
			task+=EP.getTaskdesc(index)+ "(";
			task+=date_string+")";
		}
		else if(userType.equals("Logistic")){
			String date_string = null;
			SimpleDateFormat str = new SimpleDateFormat("dd/MMM/yyyy");
			date_string = str.format(L.getTaskDate(index));

			task+=L.getTaskID(index)+ ". ";
			task+=L.getTaskdesc(index)+ "(";
			task+=date_string+")";
		}
		return task;
	}

	public int getTotalTask(){
		int index=0;
		if(userType.equals("Client")){
			return C.getTotalTaskNo();
		}
		else if(userType.equals("Event Planner")){
			return EP.getTotalTaskNo();
		}
		else if(userType.equals("Logistic")){
			return L.getTotalTaskNo();
		}

		return index;
	}

	public void removeTask(int index){
		if (userType.equals("Client")){
			C.removeTask(index);
		}
		else if (userType.equals("Event Planner")){
			EP.removeTask(index);
		}
		else if (userType.equals("Logistic")){
			L.removeTask(index);
		}
	}
	//To-Do list

	//Budget List
	public void createbudgetItem(String desc, String p, int EventID){
		double portion=Double.valueOf(p);
		double spent=0.0;
		int id=C.getTotalItemBudget(EventID);

		C.createBudgetItem(desc, portion, spent, id, EventID);
	}

	public String getBudgetSummary(int index, int EventIndex){
		String Budget="";
		Budget+=C.getBudegtID(index, EventIndex)+". ";
		Budget+=C.getDescBudget(index, EventIndex)+" (RS. ";
		Budget+=C.getPortion(index, EventIndex)+ " )";

		return Budget;
	}

	public void removeBudget(int index, int Eindex){
		C.removeBudgetItem(index, Eindex);
	}

	public Boolean checkBudgetIndex(int index, int Eindex){
		return C.BudgetIndex(index, Eindex);
	}
	//Budget List

}