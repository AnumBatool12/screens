package com.example;
import java.util.Date;

public class Task {
    public Date date;
    public String taskDesc;
    public String status;

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

    //getters
    public Date getDate(){return date;}
    public String getDesc(){return taskDesc;}
    public String getStatus(){return status;}


}
 