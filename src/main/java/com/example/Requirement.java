package com.example;

public class Requirement {
    private String EReq;

    Requirement(){}
    Requirement(String r){EReq=r;}

    //getter
    public String getRequirement(){return EReq;}

    //setter
    public void setRequirement(String req) {EReq=req;}
}
