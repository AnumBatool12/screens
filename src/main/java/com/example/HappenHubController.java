package com.example;

import java.util.Date;

//HappenHubController is a singleton
public class HappenHubController {
	private static HappenHubController hhc;//HappenHu's static Variable

	//Variables of other classes
	private Client C;
	private EventPlanner EP;
	private Logistic L;

	//variables to help identify
	private String userID;
    private String userType;//Can e Logistic, Event Planner or Client
    private String username;

	//singleton constructor
	HappenHubController(){
		
	}

	public static HappenHubController getInstance(){//get instance
		if (hhc==null){
			hhc=new HappenHubController();
		}
		return hhc;
	}
	









	//creating Event via the Client
	public void createEvent(String title, Date date, String time, String size, String userID) {
		
	}
	
	public void createClient(String name, String mail, String phone, String usn, String pw){
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