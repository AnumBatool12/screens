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
	public int getReqID(int index){return eventRequirements.get(index).getReqID();}

	//setter
	public void createRequirement(String reqs, int id) {
		Requirement newReq=new Requirement(reqs, id);
		eventRequirements.add(newReq);
		totalReqs++;
	}
	public void setReq(int index, String req) {eventRequirements.get(index).setRequirement(req);}
	public void setID(int index, int id){eventRequirements.get(index).setID(id);}

	public void removeReq(int index){eventRequirements.remove(index);}
}