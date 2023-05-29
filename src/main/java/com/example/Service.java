package com.example;
//Service
public class Service {

	private String ServiceName;
	private String ServiceDesc;
	private double Price;
	private int ID;//id from database

	Service(){}
	Service(String name, String desc, double price){
		ServiceName=name;
		ServiceDesc=desc;
		Price=price;
	}

	//getter
	public String getServiceName(){return ServiceName;}
	public String getDesc() {return ServiceDesc;}
	public double getPrice() {return Price;}
	public int getID() {return ID;}

	//setter
	public void setServiceName(String name){ServiceName = name;}
	public void setServiceDesc(String desc){ServiceDesc = desc;}
	public void setPrice(double price){Price = price;}

	public void setAll(String name, String desc, double price) {
		ServiceName=name;
		ServiceDesc=desc;
		Price=price;
	}
	public void setID(int id) {ID=id;}
	
}