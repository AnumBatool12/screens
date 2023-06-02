package com.example;


import java.util.ArrayList;
import java.util.Date;

public class RequestList {
	private ArrayList<Request> requests;
	private Integer totalRequests;

	RequestList(){
		requests=new ArrayList<Request>();
		totalRequests=0;
	}

	//setter 
	public void AddRequest(Request r){
		requests.add(r);
		totalRequests++;
	}
	public void setStatus(Boolean stat, int index){requests.get(index).setStatus(stat);}
    public void setID(int id, int index) {requests.get(index).setID(id);}
    public void setLimit(double spend, int index){requests.get(index).setLimit(spend);}
    //Event-->event requirements
    public void createRequirement(String req, int id, int INDEX){requests.get(INDEX).createRequirement(req, id);}
	public void setReq(int index, String req, int INDEX) {requests.get(INDEX).setReq(index, req);}
	public void setReqID(int index, int id, int INDEX){requests.get(INDEX).setReqID(index, id);}
    //Event-->attendee list
    public void addAttendee(Attendee add, int INDEX){ requests.get(INDEX).addAttendee(add);}
	public void setAttendeeName(int index, String name, int INDEX){ requests.get(INDEX).setAttendeeName(index, name);}
	public void setAttendeePhone(int index, String ph, int INDEX){ requests.get(INDEX).setAttendeePhone(index, ph);}
	public void setAttendeeEmail(int index, String mail, int INDEX){ requests.get(INDEX).setAttendeeEmail(index, mail);}
	public void setAttendeeStatus(int index, Boolean stat, int INDEX){ requests.get(INDEX).getAttendingStatus(index);}
	public void setAttendeeID(int id, int index, int INDEX){ requests.get(INDEX).setAttendeeID(id, index);}
    //Event -->Invoice
    public void createPaymentItem(String desc, double amt, int id, int INDEX){ requests.get(INDEX).createPaymentItem(desc, amt, id);}
	public void setPaymentDesc(int index, String desc, int INDEX){ requests.get(INDEX).setPaymentDesc(index, desc);}
	public void setAmount(int index, double amt, int INDEX){ requests.get(INDEX).setAmount(index, amt);}
	public void setPaymentID(int id, int index, int INDEX){ requests.get(INDEX).setPaymentID(id, index);}
	public double calculatePaymentTotal(int INDEX){ return requests.get(INDEX).calculatePaymentTotal();}

	//getter
	 //getters
	 public boolean getStatus(int index){return requests.get(index).getStatus();}
	 public double getLimit(int index){return requests.get(index).getLimit();}
	 public int getID(int index){return requests.get(index).getID();}
	 public Request getRequest(int index) {return requests.get(index);}
 
	 //Event
	 public String getTitle(int index) {return requests.get(index).getTitle();}
	 public Date getDate(int index) {return requests.get(index).getDate();}
	 public String getTime(int index) {return requests.get(index).getTime();}
	 public Integer getSize(int index) {return requests.get(index).getSize();}
	 public String getPaymentType(int index){return requests.get(index).getPaymentType();}
	 public Event getEvent(int index){return requests.get(index).getEvent();}
	 public int getEventID(int index){return requests.get(index).getEventID();}
 
	 //Event-->event requirements
	 public Integer getTotalReqs(int index){return requests.get(index).getTotalReqs();}
	 public String getReq(int index, int INDEX) {return requests.get(INDEX).getReq(index);}
	 public int getReqID(int index, int INDEX) {return requests.get(INDEX).getReqID(index);}
	 //Event-->attendee list
	 public String getAttendeeName(int index, int INDEX) {return requests.get(INDEX).getAttendeeName(index);}
	 public String getAttendeePhone(int index, int INDEX) {return requests.get(INDEX).getAttendeePhone(index);}
	 public String getAttendeeEmail(int index, int INDEX) {return requests.get(INDEX).getAttendeeEmail(index);}
	 public Boolean getAttendingStatus(int index, int INDEX) {return requests.get(INDEX).getAttendingStatus(index);}
	 public Integer getTotalAttendee(int INDEX) {return requests.get(INDEX).getTotalAttendee();}
	 public int geAttendeetID(int index, int INDEX) {return requests.get(INDEX).geAttendeetID(index);}
	 //Event -->Invoice
	 public Integer getTotalPaymenetItem(int index){return requests.get(index).getTotalPaymenetItem();}
	 public String getInvoiceDesc(int index, int INDEX){return requests.get(INDEX).getInvoiceDesc(index);}
	 public double getAmount(int index, int INDEX){return requests.get(INDEX).getAmount(index);}
	 public double getTotalPayment(int INDEX){return requests.get(INDEX).getTotalPayment();}
	 public int getPaymentID(int index,int INDEX){return requests.get(INDEX).getPaymentID(index);}
 
	 //User
	 public String getFullname(int index) {return requests.get(index).getFullname();}
	 public String getEmailmail(int index) {return requests.get(index).getEmailmail();}
	 public String getPhoneNo(int index) {return requests.get(index).getPhoneNo();}
 
	 //removers
	 public void removeAttendee(int index, int INDEX){requests.get(INDEX).removeAttendee(index);}
	 public void removePayment(int index, int INDEX){requests.get(INDEX).removePayment(index);}
	 public void removeReq(int index, int INDEX){requests.get(INDEX).removeReq(index);}
	 public void removeRequest(int index){requests.remove(index); }
	 public void getRidOFRejectRequest(){
		for(Request itr: requests){
			if (!itr.getStatus()){
				requests.remove(itr);
			}
		}
	 }



}