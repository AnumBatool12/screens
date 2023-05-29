package com.example;

public class Attendee {
    private String AName;
    private String phoneNo;
    private String email;
    private Boolean attending;

    Attendee(){
        attending=true;
    }

    Attendee(String name, String phone, String mail){
        AName=name;
        phoneNo=phone;
        email=mail;
        attending=true;
    }

    //getter
    public String getName(){return AName;}
    public String getPhone() {return phoneNo;}
    public String getEmail() {return email;}
    public Boolean getAttendingStatus(){return attending;}

    //setter
    public void setAll(String name, String phone, String mail, Boolean att){
        AName=name;
        phoneNo=phone;
        email=mail;
        attending=att;
    }

    public void setName(String name){AName=name;}
    public void setPhone(String ph) {phoneNo=ph;}
    public void setEmail(String mail) {email=mail;}
    public void setAttending(Boolean att) {attending=att;}
}
