package com.example;

import java.util.ArrayList;

public class ServicesList {
	private ArrayList<Service> services;
	private Integer totalServices;

	ServicesList(){//constructor
		services=new ArrayList<Service>();
		totalServices=0;
	}
 
	//getters
	public String getName(int index) {return services.get(index).getServiceName();}
	public String getDesc(int index){return services.get(index).getDesc();}
	public double getPrice(int index){return services.get(index).getPrice();}
	public Integer getTotalServices(){return totalServices;}
	public int getID(int index){return services.get(index).getID();}

	//setters
	public void createServices(String name, String desc, double price) {
		Service newService=new Service(name, desc, price);
		services.add(newService);
		totalServices++;
	}

	public void addService(Service newService) {
		services.add(newService);
		totalServices++;
	}	
	public void setID(int id, int index){services.get(index).setID(id);}

	public void setName(int index, String name) {services.get(index).setServiceName(name);}
	public void setDesc(int index, String desc){services.get(index).setServiceDesc(desc);}
	public void setPrice(int index, double price){services.get(index).setPrice(price);}
	public void removeService(int index){
		services.remove(index);
	}	
}