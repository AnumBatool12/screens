package com.example;
import java.util.Date;

public class Task {
    private Date date;
    private String taskDesc;
    private String status;
    private int ID;//id from database
 

    Task(){status="not done";}
    Task(Date date, String desc){
        this.date=date;
        taskDesc=desc;
        status="not done";
    }

    //setters 
    public void setDate(Date date) {this.date=date;}
    public void setDesc(String desc) {taskDesc=desc;}
    public void setAll(Date date, String desc){
        this.date=date;
        taskDesc=desc;
    }
    public void setStatus(String stat){status=stat;}
    public void setID(int id) {ID=id;}

    //getters
    public Date getDate(){return date;}
    public String getDesc(){return taskDesc;}
    public String getStatus(){return status;}
    public int getID() {return ID;}


}
 