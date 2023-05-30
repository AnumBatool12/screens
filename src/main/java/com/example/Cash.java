package com.example;

import java.util.ArrayList;

public class Cash implements Invoice {
    private ArrayList<Payment> paymentItems;
    private Integer totalItems;
    private double totalPayment;

    Cash(){
		paymentItems=new ArrayList<Payment>();
		totalPayment=0.0;
		totalItems=0;
	}

	//getter
	public Integer getTotalItem() {return totalItems;}
	public String getDesc(int index) {return paymentItems.get(index).getDesc();}
	public double getAmount(int index) {return paymentItems.get(index).getAmount();}
	public double getTotal() {return totalPayment;}
    public int getID(int index) {return paymentItems.get(index).getID();}

	//setter
	public void createPaymentItem(String desc, double amt, int id){
		Payment newItem=new Payment(desc, amt, id);
		paymentItems.add(newItem);
		totalItems++;
	}

	public void setDesc(int index, String desc) {paymentItems.get(index).setDesc(desc);}
	public void setAmount(int index, double amt) {paymentItems.get(index).setAmount(amt);}
	public void setID(int id, int index){paymentItems.get(index).setID(id);}

	public double calCulateTotal(){
		double spent=0.0;
		for(Payment itr: paymentItems){
			spent+=itr.getAmount();
		}
		return spent;
	}

}
