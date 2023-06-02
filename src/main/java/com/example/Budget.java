package com.example;

import java.util.ArrayList;

public class Budget { 
	private ArrayList<BudgetItem> budgetItems;
	private Integer totalItems;
	private double totalBudget;
	
	Budget(){
		budgetItems=new ArrayList<BudgetItem>();
		totalBudget=0.0;
		totalItems=0;
	}

	//getter
	public Integer getTotalItem() {return totalItems;}
	public String getDesc(int index) {return budgetItems.get(index).getDesc();}
	public double getPortion(int index) {return budgetItems.get(index).getportion();}
	public double getSpent(int index) {return budgetItems.get(index).getSpent();}
	public double getTotalBudget() {return totalBudget;}
	public int getID(int index) {return budgetItems.get(index).getID();}

	//setter
	public void createBudgetItem(String desc, double portion, double sp, int id){
		BudgetItem newItem=new BudgetItem(desc, portion, sp, id);
		budgetItems.add(newItem);
		totalItems++;
	}

	public void setDesc(int index, String desc) {budgetItems.get(index).setDesc(desc);}
	public void setPortion(int index, double portion) {budgetItems.get(index).setPortion(portion);}
	public void setSpent(int index, double sp) {budgetItems.get(index).getSpent();}
	public void setID(int id, int index){budgetItems.get(index).setID(id);}

	public double calCulateTotalSpent(){
		double spent=0.0;
		for(BudgetItem itr: budgetItems){
			spent+=itr.getSpent();
		}
		return spent;
	}

	public Boolean overBudget(){
		Boolean over=false;
		double spent=0.0;
		double comp;
		spent=calCulateTotalSpent();
		
		comp=Double.compare(spent, totalBudget);
		if (comp>0){over=true;}

		return over;
	}

	public void removeBudgetItem(int index){budgetItems.remove(index);}
}