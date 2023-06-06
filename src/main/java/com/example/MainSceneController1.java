package com.example;

import java.io.IOException;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import java.net.URL;
 

public class MainSceneController1 implements Initializable{

    //MySqlClass database = MySqlClass.getInstance();
    // boolean yes = s.userExists("one");
    // if(yes == true){System.out.println("yes");}

    //Variables for Screen Display
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    private static String userType;//Can e Logistic, Event Planner or Client
    private static int EventIndexNo;//storage for current event that is open

    private HappenHubController hhc;


    //Variables for FXML 
    //Login
    @FXML private TextField usernameLogin, passwordLogin;
    //Login
    //SignUp Client
    @FXML private TextField FullName, PhoneNo, confirmPassClient;
    @FXML private TextField email, passwordClient, usernameClient;
    //SignUp Client
    //SignUp Event Planner
    @FXML private TextField PasswordEP, confirmPassEP, usernameEP;
    @FXML private TextField EPdate, emailEP, expEP, expertiseEP;
    @FXML private TextField fullNameEP, phoneNoEP;
    //SignUp Event Planner
    //SignUp for Logistic Service
    @FXML private TextField LogisticType, LogisticUrl, LogisticUsername;
    @FXML private TextField companyEmail, companyName, confirmpassLog;
    @FXML private TextField passwordLog;
    //SignUp for Logistic Service
    //Profile Page Client
    @FXML private TextField PFullName, PPhoneNo, PconfirmPassClient;
    @FXML private TextField Pemail, PpasswordClient, PusernameClient;
    @FXML private Button Return, confirmChanges;
    //Profile Page Client
    //Profile Page Event Planner
    @FXML private TextField EPFullName, EPPhoneNo, EPconfirmPass, EPemail;
    @FXML private Button ReturnEP, confirmChangesEP;
    @FXML private TextField dateEP, experience, expertise, passwordEP, EPusername;
    //Profile Page Event Planner
    //Profile Page Logistic Service
    @FXML private TextField Cemail, CompanyName;
    @FXML private Button ReturnComp, confirmChangesComp, updateServicePage;
    @FXML private TextField ServiceType, companyURL, confirmPassComp;
    @FXML private TextField passwordComp, usernameComp;
    //Profile Page Logistic Service
    //Create Event Page
    @FXML private TextField title, Etime, ESize, Edate;
    //Create Event Page
    //Client Main Page
    @FXML private ListView<String> eventList;
    @FXML private TextField EventIndex;
    //Event Dashboard
    @FXML private TextField eventTitle, eventDate, eventTime, eventSize;
    //Event Dashboard
    //Attendee List
    @FXML private TextField guestfullName, GuestEmail, GuestphoneNum, removeGuest;
    @FXML private ListView<String> attendeeList;
    //Attendee List
    //Requirement List
    @FXML private TextField addReq, removeReq;
    @FXML private ListView<String> reqsList;
    //Requirement List

    
    //Functions
    //Set User Type
    public void setUserType(String st){userType=st;}
    //Get User Type
    public String getUserType(){return userType;}

    //Function to Confirm Login and determine User Type//
    public void Login(ActionEvent event) throws IOException{
        String usn, pswrd;

        usn=usernameLogin.getText();
        pswrd=passwordLogin.getText();

        /* 
         * Functions to determine who the User is
         * Use these to Determine User Type
         * From Database
         * Add Alerts here in case of wrong username
         * or wrong password
        
        boolean validuser  = database.userExists(usn);
        boolean correctPass=false;
        if(validuser){
            userType = database.userType(usn);
            correctPass = database.verifyPassword(pswrd);
            if(!correctPass){
                Alert alert=new Alert(AlertType.ERROR, "Incorrect Password!");
                alert.show();
            }
        }else{
            Alert alert=new Alert(AlertType.ERROR, "Incorrect Username!");
            alert.show();
        }

        if(correctPass){
             //userType="";
            hhc.setUserType(userType);

            //opening the relevant dashboard
            if (userType.equals("Client")){
                openClientDashboard(event);
            }
            else if (userType.equals("Event Planner")){
                openEP_LS_Dashboard(event);
            }
            else if (userType.equals("Logistic")){
                openEP_LS_Dashboard(event);
            }
            else {
                Alert alert=new Alert(AlertType.ERROR, "Error in Opening");
                alert.show();
            }
        }*/
       
    }

    //Client Sign in
    public void createClient(ActionEvent event) throws IOException{
        userType="Client";
        if (!((passwordClient.getText()).equals(confirmPassClient.getText()))){
            Alert alert=new Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
            alert.setContentText("Password and Confirm Password are not the same");
            alert.show();
        }
        else{
            hhc.getInstance().createClient(FullName.getText(), email.getText(), PhoneNo.getText(), usernameClient.getText(), passwordClient.getText());
            
            openClientDashboard(event);
        }
    }

    //Event Planner Sign Up
    public void createEventPlanner(ActionEvent event) throws IOException{
        userType="Event Planner";
        if (!((PasswordEP.getText()).equals(confirmPassEP.getText()))){
            Alert alert=new Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
            alert.setContentText("Password and Confirm Password are not the same");
            alert.show();
        }
        else{
            hhc.getInstance().createEventPlanner(fullNameEP.getText(), emailEP.getText(), phoneNoEP.getText(), usernameEP.getText(), PasswordEP.getText(), expertiseEP.getText(), expEP.getText(), EPdate.getText());
            openEP_LS_Dashboard(event);
        }
    }

    //Logistic Service Sign Up
    public void createLogistic(ActionEvent event) throws IOException{
        userType="Logistic";
        if (!((passwordLog.getText()).equals(confirmpassLog.getText()))){
            Alert alert=new Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
            alert.setContentText("Password and Confirm Password are not the same");
            alert.show();
        }
        else{
            hhc.getInstance().createLogistic(companyName.getText(), LogisticType.getText(), LogisticUsername.getText(), passwordLog.getText(), LogisticUrl.getText(), companyEmail.getText());
            openEP_LS_Dashboard(event);
        }
    }

    //Function to take in input from Client Profile Page
    public void setUPClientProfilePage(String fullname, String email, String phone, String username, String password){
        PFullName.setText(fullname);
        PPhoneNo.setText(phone);
        Pemail.setText(email);
        PusernameClient.setText(username);
        PpasswordClient.setText(password);
    }

    //opening the right profile page
    public void selectEP_LS_ProfilePage(ActionEvent event) throws IOException{
        if (userType.equals("Event Planner")){
            openProfilePage_EP(event);
        }
        else if (userType.equals("Logistic")){
            openProfilePage_LS(event);
        }
    }

    //Function to take input from Event Planner for Profile Page
    public void setUpEventPlannerProfile(String fullname, String email, String phone, String username, String password, String expert, String exp, String date){
        EPFullName.setText(fullname);
        EPPhoneNo.setText(phone);
        EPemail.setText(email);
        EPusername.setText(username);
        passwordEP.setText(password);
        expertise.setText(expert);
        experience.setText(exp);
        dateEP.setText(date);
    }

    //Function to take input for profile change Logistic Service
    public void setUpLogisticProfile(String name, String type, String usn, String pswd, String url, String email){
        CompanyName.setText(name);
        ServiceType.setText(type);
        usernameComp.setText(usn);
        passwordComp.setText(pswd);
        companyURL.setText(url);
        Cemail.setText(email);
    }

    //create event by Client and open client dashboard
    public void createEventbyClient(ActionEvent event) throws IOException{
        String Title=title.getText();
        String date=Edate.getText();
        String time=Etime.getText();
        String size=ESize.getText();

        hhc.getInstance().createEvent(Title, date, time, size);
        openClientDashboard(event);
    }

    //Functions used to display event in listview
    public Boolean checkIndex(int index){
        Boolean present=hhc.getInstance().checkIndexEvent(index);
        return present;
    }

    public String getEventSumm(int index){
        String summ=hhc.getInstance().getEventSummary(index);
        return summ;
    }

    public void clearEventList() {
        eventList.getItems().clear();//clear the list view
    }

    public void addItemToEventListC(String summ){
        eventList.getItems().add(summ);
    }
    //Functions used to display event in listview

    //Function to save Event/Request we are using
    public int getEventNo(){
        
        return EventIndexNo;
    }

    //Fill in Information for Event Main Page
    public void fillEventDashboard(String title, String date, String time, String size){
        eventTitle.setText(title);
        eventDate.setText(date);
        eventTime.setText(time);
        eventSize.setText(size);
    }

    //Attendee Related Functions
    //Adding Attendee in Attendee List
    public void createAttendee(ActionEvent event) throws IOException{
        hhc.getInstance().createAttendee(guestfullName.getText(), GuestphoneNum.getText(), GuestEmail.getText(), true, EventIndexNo);
        openAttendeeList(event);
    }

    public Boolean checkAttIndex(int index){
        Boolean present=hhc.getInstance().checkIndexAttList(index, EventIndexNo);
        return present;
    }

    public void addAttendeetoList(String sum){
        attendeeList.getItems().add(sum);
    }

    public void ClearAttendeeList() {
        attendeeList.getItems().clear();
    }
     //Adding Attendee in Attendee List

    //Return utton in Attendee List
    public void returnToDashAttendeeToEvent(ActionEvent event) throws IOException{
        if(getUserType().equals("Client")){
            openEventDashboard(event);
        }
        else if (getUserType().equals("Event Planner")){
            openEventDashboard_EP(event);
        }
        else if (getUserType().equals("Logistic")){
            openEventDashboard_LS(event);
        }
    }

    //removing attendee
    public void removeAttendee(ActionEvent event) throws IOException{
        int indexRemove=Integer.parseInt(removeGuest.getText());
        if(getUserType().equals("Client")){
            hhc.getInstance().removeAttendee(indexRemove, EventIndexNo);
        }
        //add for event planner

        openAttendeeList(event);
    }
    //Attendee Related Functions

    //Event Requirement Related Functions
    public void createRequirement(ActionEvent event) throws IOException{
        hhc.getInstance().createRequirement(addReq.getText(), EventIndexNo);
        openEventReqirementsForm(event);
    }

    public Boolean checkReqIndex(int index){
        Boolean present=hhc.getInstance().checkIndexReqList(index, EventIndexNo);
        return present;
    }

    public void addRequirementtoList(String sum){
        reqsList.getItems().add(sum);
    }

    public void ClearRequirementList() {
        reqsList.getItems().clear();
    }

    public void removeRequirement(ActionEvent event) throws IOException{
        int indexRemove=Integer.parseInt(removeReq.getText());
        if(getUserType().equals("Client")){
            hhc.getInstance().removeRequirement(indexRemove, EventIndexNo);
        }
        //add for event planner

        openEventReqirementsForm(event);
    }
    //Event Requirement Related Functions












    @Override //initializes all the pages
    public void initialize(URL location, ResourceBundle resources) { }

    //Loader Function
    public void LoadPage(Parent root, ActionEvent event){
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Login Form
    public void openLoginPage(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController1.fxml"));
        LoadPage(root, event);
    }

    // Sign Up options for different types of actors
    public void goToSignUpPage(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController2.fxml"));
        LoadPage(root, event);
    }

    //Open Sign Up Form for Client
    public void openSignUpForm_Client(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController3.fxml"));
        root=loader.load();
        LoadPage(root, event);

        MainSceneController1 controller1=loader.getController();
        controller1.setUserType("Client");
    }

    //Open Final SignUp Form for Event Planner
    public void openSignUpForm2_EventPlanner(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController5.fxml"));
        root=loader.load();
        LoadPage(root, event);

        MainSceneController1 controller1=loader.getController();
        controller1.setUserType("Event Planner");
    }

    //Open Sign Up Form for Logistic Service
    public void openSignUpFormLogisticService(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController6.fxml"));
        root=loader.load();
        LoadPage(root, event);

        MainSceneController1 controller1=loader.getController();
        controller1.setUserType("Logistic");
    }

    //Open Dashboard for Client
    public void openClientDashboard(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController7.fxml"));
        root=loader.load();
        LoadPage(root, event);
        
        MainSceneController1 controller1=loader.getController();
        controller1.clearEventList();
        for(int i=0;controller1.checkIndex(i); i++){
            controller1.addItemToEventListC(controller1.getEventSumm(i));
        }

        if (EventIndex!=null){
            EventIndexNo=Integer.parseInt(EventIndex.getText());
        }
    }

    //Open Create Event Option
    public void openCreateEventForm(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController8.fxml"));
        root=loader.load();
        LoadPage(root, event);
    }

    //Open DashBoard For Event
    public void openEventDashboard(ActionEvent event) throws IOException{
        int index=EventIndexNo;
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController9.fxml"));
        root=loader.load();
        LoadPage(root, event);

        MainSceneController1 controller1=loader.getController();
        String title=hhc.getInstance().getEventTitle(index);
        String date=hhc.getInstance().getEventDate(index);
        String time=hhc.getInstance().getEventTime(index);
        String size=Integer.toString(hhc.getInstance().getEventSize(index));

        controller1.fillEventDashboard(title, date, time, size);

    }

    //Open Form to Change Client's Personal Profile Information
    public void openProfilePage_Client(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController10.fxml"));
        Parent root=loader.load();
        LoadPage(root, event);

        MainSceneController1 controller1=loader.getController();
        String clientFullName = hhc.getInstance().getClientName();
        String clientEmail=hhc.getInstance().getClientEmail();
        String clientPhone=hhc.getInstance().getClientPhoneNo();
        String username=hhc.getInstance().getClientUsername();
        String password=hhc.getInstance().getClientPassword();
        controller1.setUPClientProfilePage(clientFullName, clientEmail, clientPhone, username, password);
        
        /**
         * Can use this function to take in changes made to profile
         */
    
    }

    //Open Form to Create/Update Attendee List
    public void openAttendeeList(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController11.fxml"));
        root=loader.load();
        LoadPage(root, event);
        
        MainSceneController1 controller1=loader.getController();
        controller1.ClearAttendeeList();
        for(int i=0;controller1.checkAttIndex(i); i++){
                controller1.addAttendeetoList(hhc.getInstance().getAttendeeSummary(i, EventIndexNo));
        }  
        
    }

    //Open Form to Create/Update To Do List
    public void openToDoList(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController12.fxml"));
        LoadPage(root, event);
    }

    //Opening Event Planner or Logistic Service Dashboard
    public void openEP_LS_Dashboard(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController13.fxml"));
        LoadPage(root, event);
    }

    //Open Form to Change Event Planners Personal Information
    public void openProfilePage_EP(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController14.fxml"));
        Parent root=loader.load();
        LoadPage(root, event);

        MainSceneController1 controller1=loader.getController();
        String EPFullName = hhc.getInstance().getEPFullname();
        String EPEmail=hhc.getInstance().getEPEmailmail();
        String EPPhone=hhc.getInstance().getEPPhoneNo();
        String username=hhc.getInstance().getEPUsername();
        String password=hhc.getInstance().getEPPassword();
        String expert=hhc.getInstance().getEPExpertise();
        String exp=hhc.getInstance().getEPExperience();
        String EPDate=hhc.getInstance().getEPStartDate();

        controller1.setUpEventPlannerProfile(EPFullName, EPEmail, EPPhone, username, password, expert, exp, EPDate);
        /**
         * Can use this function to take in changes made to profile
         */
    }

    //Opening Event Dashboard for Event Planner
    public void openEventDashboard_EP(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController15.fxml"));
        LoadPage(root, event);
    }

    //Opening Event Dashboard Logistics
    public void openEventDashboard_LS(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController16.fxml"));
        LoadPage(root, event);
    }

    //Event Requests from Client to Event Planner or Logistic Service
    public void openEventRequestForm(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController17.fxml"));
        LoadPage(root, event);
    }

    //Open Request List by Event Planner or Logistic Service
    public void openEventRequestList(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController18.fxml"));
        LoadPage(root, event);
    }

    //Open Request by Event Planner or Logistics
    public void openEventRequest(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController19.fxml"));
        LoadPage(root, event);
    }

    //Profile Change for Logistic Service
    public void openProfilePage_LS(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController20.fxml"));
        Parent root=loader.load();
        LoadPage(root, event);

        MainSceneController1 controller1=loader.getController();
        String name=hhc.getInstance().getCompanyName();
        String type=hhc.getInstance().getCompanyType();
        String username=hhc.getInstance().getCompanyUserName();
        String password=hhc.getInstance().getCompanyPassword();
        String url=hhc.getInstance().getWebsiteUrl();
        String email=hhc.getInstance().getLogisticEmail();
        controller1.setUpLogisticProfile(name, type, username, password, url, email);

        /**
        * Can use this function to take in changes made to profile
        */
    }

    //Open Logistic's Service/Web Page
    public void openServicePage_LS(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController21.fxml"));
        LoadPage(root, event);
    }

    //Open Form to Set Event Requirements
    public void openEventReqirementsForm(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainSceneController22.fxml"));
        root=loader.load();
        LoadPage(root, event);

        MainSceneController1 controller1=loader.getController();
        controller1.ClearRequirementList();
        for(int i=0;controller1.checkReqIndex(i); i++){
            controller1.addRequirementtoList(hhc.getInstance().getRequirementSummary(i, EventIndexNo));;
        }
    }

    //Open Search for Event Planner and Logistics
    public void openSearch(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController23.fxml"));
        LoadPage(root, event);
    }

    //Open Event Planner Display Page
    public void openSearch_EP(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController24.fxml"));
        LoadPage(root, event);
    }

    //Open Logistic Service Display Page
    public void openSearch_LS(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController25.fxml"));
        LoadPage(root, event);
    }

    //Page to Create Budget
    public void openCreateBudgetForm(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController26.fxml"));
        LoadPage(root, event);
    }

    //Page to Create Bill
    public void openCreateBillForm(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController27.fxml"));
        LoadPage(root, event);
    }
}