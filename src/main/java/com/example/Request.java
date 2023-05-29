package com.example;

import java.time.LocalDate;

//Request
public class Request {
    private Boolean status;
    private int reqNum;
    private Event event;
    private User user;
    private int ID;

    Request(){}

    Request(Boolean stat, int num, Event event, User user, int id){
        status = stat;
        reqNum=num;
        this.event=event;
        this.user=user;
        ID=id;
    }

    //setters
    public void setStatus(Boolean stat){status = stat;}
    public void setNum(int num) {reqNum=num;}
    public void setID(int id) {ID=id;}

    //getters
    public boolean getStatus(){return status;}
    public int getReqNum(){return reqNum;}
    public String getTitle() {return event.getTitle();}
	public LocalDate getDate() {return event.getDate();}
	public String getTime() {return event.getTime();}
	public Integer getSize() {return event.getSize();}
    public String getFullname() {return user.getFullname();}
	public String getEmailmail() {return user.getEmailmail();}
	public String getPhoneNo(){return user.getPhoneNo();}
    public int getID(){return ID;}
}