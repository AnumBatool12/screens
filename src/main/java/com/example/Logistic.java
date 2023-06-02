package com.example;

import java.util.Date;


//Logistic
public class Logistic {
	private String CompanyName;
	private String CompanyType;
	private String userName;
	private String password;
	private String CompanyDesc;
	private String CompanyEmail;
	private String websiteUrl; 
	private int LogID;

	//objects of other classes
	private ServicesList Sl;
	private RequestList er;//event requests
	private Scheduler tdl;

	Logistic(){
		Sl=new ServicesList();
		er=new RequestList();
		tdl=new Scheduler();
	}
 
	Logistic(String name, String type, String usn, String paswd, String url, String email){
		CompanyName=name;
		CompanyType=type;
		userName=usn;
		password=paswd;
		websiteUrl=url; 
		CompanyEmail=email;
		Sl=new ServicesList();
		er=new RequestList();
		tdl=new Scheduler();
	}

	Logistic(String name, String type, String usn, String paswd, String desc, String url, String email, ServicesList sl, RequestList rl, Scheduler T, int id){
		CompanyName=name;
		CompanyType=type;
		userName=usn;
		password=paswd;
		CompanyDesc=desc;
		websiteUrl=url; 
		CompanyEmail=email;
		LogID=id;
		Sl=sl;
		er=rl;
		tdl=T;
	}
	
	public String getCompanyName(){return CompanyName;}
	public String getCompanyType(){return CompanyType;}
	public String getUserName(){return userName;}
	public String getPassword(){return password;}
	public String getCompanyDesc(){return CompanyDesc;}
	public  String getWebsiteUrl(){return websiteUrl;}
	public String getLogisticEmail(){return CompanyEmail;}
	public int getLogID(){return LogID;}
	public void setCompanyName(String name) {CompanyName=name;}
	public void setCompanyType(String Type) {CompanyType=Type;}
	public void setUsername(String un) {userName=un;}
	public void setPassword(String pw) {password=pw;}
	public void setCompanyDesc(String desc) {CompanyDesc=desc;}
	public void setURL(String url) {websiteUrl=url;}
	public void setCompanyEmail(String email){CompanyEmail=email;}
	public void setLogID(int id){LogID=id;}

	//services functions
	//getters
	public String getName(int index) {return Sl.getName(index);}
	public String getDesc(int index){return Sl.getDesc(index);}
	public double getPrice(int index){return Sl.getPrice(index);}
	public Integer getTotalServices(){return Sl.getTotalServices();}
	public int getServicesID(int index){return Sl.getID(index);}

	//setters
	public void createServices(String name, String desc, double price) {Sl.createServices(name, desc, price);}
	public void addService(Service newService) {Sl.addService(newService);}	
	public void setServicesID(int id, int index){Sl.setID(id, index);;}
	public void setServicesName(int index, String name) {Sl.setName(index, name);}
	public void setServicesDesc(int index, String desc){Sl.setDesc(index, desc);}
	public void seServicestPrice(int index, double price){Sl.setPrice(index, price);}
	public void removeService(int index){Sl.removeService(index);}

	//Schedular Functions
	//getters
	public int getTotalTaskNo(){return tdl.getTotalTaskNo();}
	public Task getTask(int index){return tdl.getTask(index);}
	public Date getTaskDate(int index) {return tdl.getDate(index);}
	public String getTaskdesc(int index){return tdl.getTaskdesc(index);}
	public String getTaskStat(int index) {return tdl.getStat(index);}
	public int getTaskID(int index){return tdl.getID(index);}

	//setters
	public void setDate(int index, Date date) {tdl.setDate(index, date);}
	public void setTask(int index, String task) {tdl.setTask(index, task);}
	public void setAll(int index, String task, Date date) {tdl.setAll(index, task, date);}
	public void setStatus(int index, String stat) {tdl.setStatus(index, stat);}
	public void addTask(Task task) {tdl.addTask(task);}
	public void allNewTask(String task, Date date) {tdl.allNewTask(task, date);} 
	public void setTaskID(int id, int index){tdl.setID(id, index);}
	public void removeTask(int index){ tdl.removeTask(index);}

	//Request List Functions
	//setter 
	public void AddRequest(Request r){er.AddRequest(r);}
	public void setRequestStatus(Boolean stat, int index){er.setStatus(stat, index);}
    public void setRequestID(int id, int index) {er.setID(id, index);}
    public void setRequestLimit(double spend, int index){er.setLimit(spend, index);}
    //Event-->event requirements
    public void createRequirement(String req, int id, int INDEX){er.createRequirement(req, id, INDEX);}
	public void setReq(int index, String req, int INDEX) {er.setReq(index, req, INDEX);}
	public void setReqID(int index, int id, int INDEX){er.setReqID(index, id, INDEX);}
	//Event -->Invoice
    public void createPaymentItem(String desc, double amt, int id, int INDEX){ er.createPaymentItem(desc, amt, id, INDEX);}
	public void setPaymentDesc(int index, String desc, int INDEX){ er.setPaymentDesc(index, desc, INDEX);}
	public void setAmount(int index, double amt, int INDEX){ er.setAmount(index, amt, INDEX);}
	public void setPaymentID(int id, int index, int INDEX){ er.setPaymentID(id, index, INDEX);}
	public double calculatePaymentTotal(int INDEX){ return er.calculatePaymentTotal(INDEX);}

	//getter
	public boolean getRequestStatus(int index){return er.getStatus(index);}
	 public int getRequestNum(int index){return er.getReqID(index, index);}
	 public double getLimit(int index){return er.getLimit(index);}
	 public int getRequestID(int index){return er.getID(index);}
	 public Request getRequest(int index) {return er.getRequest(index);}
	 //Event
	 public String getEventTitle(int index) {return er.getTitle(index);}
	 public Date getEventDate(int index) {return er.getDate(index);}
	 public String getEventTime(int index) {return er.getTime(index);}
	 public Integer getEventSize(int index) {return er.getSize(index);}
	 public String getPaymentType(int index){return er.getPaymentType(index);}
	 public Event getEvent(int index){return er.getEvent(index);}
	 public int getEventID(int index){return er.getEventID(index);}
	  //Event-->event requirements
	  public Integer getTotalReqs(int index){return er.getTotalReqs(index);}
	  public String getReq(int index, int INDEX) {return er.getReq(index, INDEX);}
	  public int getReqID(int index, int INDEX) {return er.getReqID(index, INDEX);}
	  //Event -->Invoice
	 public Integer getTotalPaymenetItem(int index){return er.getTotalPaymenetItem(index);}
	 public String getInvoiceDesc(int index, int INDEX){return er.getInvoiceDesc(index, INDEX);}
	 public double getAmount(int index, int INDEX){return er.getAmount(index, INDEX);}
	 public double getTotalPayment(int INDEX){return er.getTotalPayment(INDEX);}
	 public int getPaymentID(int index,int INDEX){return er.getPaymentID(index, INDEX);}

	  //User
	  public String getFullname(int index) {return er.getFullname(index);}
	  public String getEmailmail(int index) {return er.getEmailmail(index);}
	  public String getPhoneNo(int index) {return er.getPhoneNo(index);}

	   //removers
	 public void removePayment(int index, int INDEX){er.removePayment(index, INDEX);;}
	 public void removeReq(int index, int INDEX){er.removeReq(index, INDEX);;}
	 public void removeRequest(int index){ er.removeRequest(index);}
	 public void getRidOFRejectRequest(){er.getRidOFRejectRequest();}
  
 
	  
 
 
    
	
}