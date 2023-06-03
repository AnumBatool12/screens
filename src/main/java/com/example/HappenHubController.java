package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

//HappenHubController is a singleton
public class HappenHubController {
	private static HappenHubController hhc;//HappenHu's static Variable

	//Variables of other classes
	private Client C;
	private EventPlanner EP;
	private Logistic L;

	//variables to help identify
    private String userType;//Can be Logistic, Event Planner or Client


	//singleton constructor
	HappenHubController(){}

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
		/*
		 * Function adds EP to database
		 * Assign EP an ID from here
		 */
	}

	//Logistic Service Sign Up
	public void createLogistic(String name, String type, String usn, String paswd, String url, String email){
		L=new Logistic(name, type, usn, paswd, url, email);
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


	//creating Event via the Client
	public void createEvent(String title, Date date, String time, String size, String userID) {
		
	}
	
	
	
	public void createLogisticAccount(Object Username, Object Password, Object LogisticType) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void addLogisticName(Object CompanyName) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void addWebsiteURL(Object URL) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void addLogisticDescription(Object description) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void addService(Object ServiceName, Object ServiceDesc,
			Object Image, Object Price) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void addImageToPortfolio(Object Image) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void getRequestList() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void openEventRequest(Object RequestNo) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void manageEventRequest(Object RequestNo, Object decision) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	public void getClientList() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void addEventToSchedular(Object RequestNo) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	public void updateEventRequirements(Object reqs, Object RequestNo) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	public void createEventReqs() {
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
	public void createBudgetItemList() {
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
	public void showdetailsplanner() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}