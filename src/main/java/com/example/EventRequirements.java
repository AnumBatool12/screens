package com.example;

import java.util.ArrayList;

//Event Requirement List
public class EventRequirements {
	private ArrayList<Requirement> eventRequirements;
	Integer totalReqs;

	EventRequirements(){
		eventRequirements=new ArrayList<Requirement>();
		totalReqs=0;
	}

	//getter
	public Integer getTotalReqs(){return totalReqs;}
	public String getReq(int index){return eventRequirements.get(index).getRequirement();}

	//setter
	public void createRequirement(String reqs) {
		Requirement newReq=new Requirement(reqs);
		eventRequirements.add(newReq);
		totalReqs++;
	}
	public void setReq(int index, String req) {eventRequirements.get(index).setRequirement(req);}

}