package com.example;

import java.util.ArrayList;

public interface Invoice {
    
	//getter
	public Integer getTotalItem();
	public String getDesc(int index);
	public double getAmount(int index);
	public double getTotalBudget();
    public int getID(int index);

	//setter
	public void createPaymentItem(String desc, double amt, int id);

	public void setDesc(int index, String desc);
	public void setAmount(int index, double amt);
	public void setID(int id, int index);

	public double calCulateTotalSpent();

	public Boolean overBudget();
}
