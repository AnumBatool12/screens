package com.example;

import java.io.IOException;
import java.time.LocalDate;
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
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import java.net.URL;

public class MainSceneController1 implements Initializable{

    //MySqlClass s = MySqlClass.getInstance();

    //Variables for Screen Display
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    private String userType;//Can e Logistic, Event Planner or Client
    private HappenHubController hhc;


    //Variables for FXML 
    //Login
    @FXML private TextField usernameLogin;
    @FXML private TextField passwordLogin;
    //Login
    //SignUp Client
    @FXML private TextField FullName;
    @FXML private TextField PhoneNo;
    @FXML private TextField confirmPassClient;
    @FXML private TextField email;
    @FXML private TextField passwordClient;
    @FXML private TextField usernameClient;
    //SignUp Client
    //SignUp Event Planner
    @FXML private TextField PasswordEP;
    @FXML private TextField confirmPassEP;
    @FXML private TextField usernameEP;
    @FXML private TextField EPdate;
    @FXML private TextField emailEP;
    @FXML private TextField expEP;
    @FXML private TextField expertiseEP;
    @FXML private TextField fullNameEP;
    @FXML private TextField phoneNoEP;
    //SignUp Event Planner
    //SignUp for Logistic Service
    @FXML private TextField LogisticType;
    @FXML private TextField LogisticUrl;
    @FXML private TextField LogisticUsername;
    @FXML private TextField companyEmail;
    @FXML private TextField companyName;
    @FXML private TextField confirmpassLog;
    @FXML private TextField passwordLog;
    //SignUp for Logistic Service
    //Profile Page Client
    @FXML private TextField PFullName;
    @FXML private TextField PPhoneNo;
    @FXML private TextField PconfirmPassClient;
    @FXML private TextField Pemail;
    @FXML private TextField PpasswordClient;
    @FXML private TextField PusernameClient;
    @FXML private Button Return;
    @FXML private Button confirmChanges;
    //Profile Page Client


    @FXML
    private TextField title;//

    @FXML
    private TextField Etime;//

    @FXML
    private TextField ESize;//

    @FXML
    private DatePicker Edate;//

    @FXML
    private Button createEvent;//

    //Functions
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
        */
        userType="";
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

    public void setUPClientProfilePage(String fullname, String email, String phone, String username, String password){
        PFullName.setText(fullname);
        PPhoneNo.setText(phone);
        Pemail.setText(email);
        PusernameClient.setText(username);
        PpasswordClient.setText(password);
    }

    //Event Planner profile change
    //Logistics Profile Change
    //Logistics Services Section
    //Create Event Client
    //Load To-Do List Client






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
        root=FXMLLoader.load(getClass().getResource("MainSceneController3.fxml"));
        LoadPage(root, event);
    }

    //Open Final SignUp Form for Event Planner
    public void openSignUpForm2_EventPlanner(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController5.fxml"));
        LoadPage(root, event);
    }

    //Open Sign Up Form for Logistic Service
    public void openSignUpFormLogisticService(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController6.fxml"));
        LoadPage(root, event);
    }

    //Open Dashboard for Client
    public void openClientDashboard(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController7.fxml"));
        LoadPage(root, event);
    }

    //Open Create Event Option
    public void openCreateEventForm(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController8.fxml"));
        LoadPage(root, event);
    }

    //Open DashBoard For Event
    public void openEventDashboard(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController9.fxml"));
        LoadPage(root, event);
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
        root=FXMLLoader.load(getClass().getResource("MainSceneController11.fxml"));
        LoadPage(root, event);
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
        root=FXMLLoader.load(getClass().getResource("MainSceneController14.fxml"));
        LoadPage(root, event);
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
        root=FXMLLoader.load(getClass().getResource("MainSceneController20.fxml"));
        LoadPage(root, event);
    }

    //Open Logistic's Service/Web Page
    public void openServicePage_LS(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController21.fxml"));
        LoadPage(root, event);
    }

    //Open Form to Set Event Requirements
    public void openEventReqirementsForm(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("MainSceneController22.fxml"));
        LoadPage(root, event);
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


    //create event and open client dashboard
    public void createEventbyClient(ActionEvent event) throws IOException{
        String Title=title.getText();
        LocalDate date=Edate.getValue();
        String time=Etime.getText();
        String size=ESize.getText();

        //HappenHubController.getInstance().createEvent(Title, date, time, size, userID);//creating event
        openEventDashboard(event);
    }

}