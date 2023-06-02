package com.example;

public class Requirement {
    private String EReq;
    private int ID;

    Requirement(){}
    Requirement(String r, int id) 
    {
        EReq=r;
        ID=id;
    }

    //getter
    public String getRequirement(){return EReq;}
    public int getReqID() {return ID;}


    //setter
    public void setRequirement(String req) {EReq=req;}
    public void setID(int ID) {this.ID=ID;}
}
