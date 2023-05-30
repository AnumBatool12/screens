package com.example;
//Logistic
public class Logistic {
	private String CompanyName;
	private String CompanyType;
	private String userName;
	private String password;
	private String CompanyDesc;
	private String websiteUrl; 

	//objects of other classes
	private ServicesList servicesList;
	private RequestList eventRequests;

	Logistic(){
		servicesList=new ServicesList();
		eventRequests=new RequestList();
	}
 
	Logistic(String name, String type, String usn, String paswd, String desc, String url){
		CompanyName=name;
		CompanyType=type;
		userName=usn;
		password=paswd;
		CompanyDesc=desc;
		websiteUrl=url; 
		servicesList=new ServicesList();
		eventRequests=new RequestList();
	}

	Logistic(String name, String type, String usn, String paswd, String desc, String url, ServicesList sl, RequestList rl){
		CompanyName=name;
		CompanyType=type;
		userName=usn;
		password=paswd;
		CompanyDesc=desc;
		websiteUrl=url; 
		servicesList=sl;
		eventRequests=rl;
	}
	

	public String getCompanyName(){return CompanyName;}
	public String getCompanyType(){return CompanyType;}
	public String getUserName(){return userName;}
	public String getPassword(){return password;}
	public String getCompanyDesc(){return CompanyDesc;}
	public  String getWebsiteUrl(){return websiteUrl;}
	public void setCompanyName(String name) {CompanyName=name;}
	public void setCompanyType(String Type) {CompanyType=Type;}
	public void setUsername(String un) {userName=un;}
	public void setPassword(String pw) {password=pw;}
	public void setCompanyDesc(String desc) {CompanyDesc=desc;}
	public void setURL(String url) {websiteUrl=url;}

	//services
	
	
}