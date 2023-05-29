package com.example;

public class BudgetItem {
	private int ID;
	private String itemDesc;
	private double budgetPortion;
	private double spent;

	BudgetItem(){
		budgetPortion=0.0;
		spent=0.0;
	}

	BudgetItem(String desc, double portion, double sp, int id){
		ID=id;
		itemDesc=desc;
		budgetPortion=portion;
		spent=sp;
	}

	//getters
	public int getID(){return ID;}
	public String getDesc(){return itemDesc;}
	public double getportion(){return budgetPortion;}
	public double getSpent() {return spent;}

	//setters
	public void setID(int id) {ID=id;}
	public void setDesc(String desc) {itemDesc=desc;}
	public void setPortion(double portion) {budgetPortion=portion;}
	public void setSpent(double sp) {spent=sp;}
	public void setAll(String desc, double portion, double sp, int id){
		ID=id;
		itemDesc=desc;
		budgetPortion=portion;
		spent=sp;
	}
	
}