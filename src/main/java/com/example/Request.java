package com.example;

import java.time.LocalDate;

//Request
public class Request {
    private Boolean status;//accepted or rejected
    private int reqNum;
    private double limit;//how much can they spend
    private Event event;
    private User user;
    private int ID;

    Request()
    {
        event=new Event();
        user=new Client();
        status=true;
    } 

    Request(Boolean stat, int num, Event event, User user, int id, double spend){
        status = stat;
        reqNum=num;
        this.event=event;
        this.user=user;
        ID=id;
        limit=spend;
        event=new Event();
        user=new Client();
    }

    Request(Boolean stat, int num, Event event, User user, int id, double spend, String userType){
        status = stat;
        reqNum=num;
        this.event=event;
        this.user=user;
        ID=id;
        limit=spend;

        event=new Event();
        if (userType.equals("Client")){
            user=new Client();
        }
        else if(userType.equals("Event Planner")){

        }
        else {
            user=new Client();
        }
        
    }

    Request (String userType){
        event=new Event();
        event=new Event();
        if (userType.equals("Client")){
            user=new Client();
        }
        else if(userType.equals("Event Planner")){

        }
        else {
            user=new Client();
        }
    }
    //setters
    public void setStatus(Boolean stat){status = stat;}
    public void setNum(int num) {reqNum=num;}
    public void setID(int id) {ID=id;}
    public void setLimit(double spend){limit=spend;}
    //Event-->event requirements
    public void createRequirement(String req, int id){event.createRequirement(req, id);}
	public void setReq(int index, String req) {event.setReq(index, req);}
	public void setReqID(int index, int id){event.setReqID(index, id);}
    //Event-->attendee list
    public void addAttendee(Attendee add){ event.addAttendee(add);}
	public void setAttendeeName(int index, String name){event.setAttendeeName(index, name);}
	public void setAttendeePhone(int index, String ph){event.setAttendeePhone(index, ph);}
	public void setAttendeeEmail(int index, String mail){event.setAttendeeEmail(index, mail);}
	public void setAttendeeStatus(int index, Boolean stat){event.getAttendingStatus(index);}
	public void setAttendeeID(int id, int index){event.setAttendeeID(id, index);}
    //Event -->Invoice
    public void createPaymentItem(String desc, double amt, int id){event.createPaymentItem(desc, amt, id);}
	public void setPaymentDesc(int index, String desc){event.setPaymentDesc(index, desc);}
	public void setAmount(int index, double amt){event.setAmount(index, amt);}
	public void setPaymentID(int id, int index) {event.setPaymentID(id, index);}
	public double calculatePaymentTotal(){return event.calculatePaymentTotal();}

    //getters
    public boolean getStatus(){return status;}
    public int getReqNum(){return reqNum;}
    public double getLimit() {return limit;}
    public int getID(){return ID;}

    //Event
    public String getTitle() {return event.getTitle();}
	public LocalDate getDate() {return event.getDate();}
	public String getTime() {return event.getTime();}
	public Integer getSize() {return event.getSize();}
    public String getPaymentType(){return event.getPaymentType();}
    public Event getEvent(){return event;}

    //Event-->event requirements
    public Integer getTotalReqs(){return event.getTotalReqs();}
	public String getReq(int index) {return event.getReq(index);}
	public int getReqID(int index){return event.getReqID(index);}
    //Event-->attendee list
    public String getAttendeeName(int index){return event.getName(index);}
    public String getAttendeePhone(int index) {return event.getPhone(index);}
    public String getAttendeeEmail(int index) {return event.getEmail(index);}
    public Boolean getAttendingStatus(int index){return event.getAttendingStatus(index);}
	public Integer getTotalAttendee(){return event.getTotalAttendee();}
	public int geAttendeetID(int index){return event.geAttendeetID(index);}
    //Event -->Invoice
    public Integer getTotalPaymenetItem(){return event.getTotalItem();}
	public String getInvoiceDesc(int index){return event.getDesc(index);}
	public double getAmount(int index){return event.getAmount(index);}
	public double getTotalPayment(){return event.getTotal();}
    public int getPaymentID(int index){return event.getPaymentID(index);}

    //User
    public String getFullname() {return user.getFullname();}
	public String getEmailmail() {return user.getEmailmail();}
	public String getPhoneNo(){return user.getPhoneNo();}

    //removers
    public void removeAttendee(int index){event.removeAttendee(index);}
	public void removeBudgetItem(int index){event.removeBudgetItem(index);}
	public void removePayment(int index) {event.removePayment(index);}
	public void removeReq(int index){event.removeReq(index);}
    
}