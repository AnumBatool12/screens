package com.example;

import java.time.LocalDate;

//HappenHubController
public class HappenHubController {
	//variables
	private Client client;
	private Event Clientevent;


	//creating Event
	public void createEvent(String title, LocalDate date, String time, String size, String userID) {
		Clientevent=new Event(title, date, time, size);
		System.out.println("Im here");
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