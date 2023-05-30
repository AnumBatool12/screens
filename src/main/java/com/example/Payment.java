package com.example;

public class Payment {
    private int ID;
	private String PayDesc;
	private double amount;

    Payment(){
		amount=0.0;
	}

	Payment(String desc, double amt, int id){
		ID=id;
		PayDesc=desc;
		amount=amt;
	}

    //getters
	public int getID(){return ID;}
	public String getDesc(){return PayDesc;}
	public double getAmount(){return amount;}


	//setters
	public void setID(int id) {ID=id;}
	public void setDesc(String desc) {PayDesc=desc;}
	public void setAmount(double amt) {amount=amt;}
	public void setAll(String desc, double amt, int id){
		ID=id;
		PayDesc=desc;
		amount=amt;
	}

}