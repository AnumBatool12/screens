package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date; 
 
public class MySqlClass{
    private Connection cn;
    private static MySqlClass instance;
    private String jdbcUrl = "jdbc:mysql://localhost:3306/finalproject";
    private String username = "root";
    private String password = "Saikobaka002";

    private MySqlClass(){
        instance = null;
    }
    public void MyConnection()
    {
        try {
            cn = DriverManager.getConnection(jdbcUrl, username, password);
            // Use the cn object for database operations
        } catch (SQLException e) {
            // Handle any potential errors that might occur during connection
            e.printStackTrace();
        }
        
        // String con = "server=localhost;uid=root;pwd=Saikobaka002;database=finalproject";
        // cn. = con;
        // cn.Open();
        //ConnectionString = con;
    }
    public static MySqlClass getInstance(){
        if(instance == null){
            instance = new MySqlClass();
            instance.MyConnection();
            return instance;
        }
        else{
            return instance;
        }
    }

    public boolean logisticExists(String username){
        boolean exists = false;
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "select logisticUsername from LogisticService where logisticUsername = ? ";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, username);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            String user = "";
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    user = resultset.getString("logisticUsername");
                }
                i++;
            }

            if(user.equals(username)){
                exists = true;
            }else{
                exists = false;
            }
        
            resultset.close();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }

    public boolean userExists(String username){
        boolean exists = false;
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "select username from User_ where username = ? ";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, username);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            String user = "";
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    user = resultset.getString("username");
                }
                i++;
            }

            if(user.equals(username)){
                exists = true;
            }else{
                exists = logisticExists(username);
            }
        
            resultset.close();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }

    public String getUserType(String username){
        String type = "";
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "select usertype from User_ where username = ? ";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, username);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    type = resultset.getString("usertype");
                }
                i++;
            }
            resultset.close();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return type;
    }

    public String userType(String username){
        String type="";
        boolean user = userExists(username);
        boolean logistic;
        if(user == true){
            type = getUserType(username);
        }else{
            logistic = logisticExists(username);
            if(logistic == true){
                type = "Logistic";
            }
        }
        return type;
    }

    public boolean verifyLogisticPassword(String username, String Pass){
        boolean correct = false;
        try {
            String sqlQuery = "select logisticPassword from LogisticService where logisticUsername = ? ";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, username);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            String pass = "";
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    pass = resultset.getString("password");
                }
                i++;
            }

            if(pass.equals(Pass)){
                correct = true;
            }else{
                correct = false;
            }
        
            resultset.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return correct;
    }

    public boolean verifyPassword(String username, String Pass){
        boolean correct = false;
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "select password from User_ where username = ? ";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, username);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            String pass = "";
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    pass = resultset.getString("password");
                }
                i++;
            }
            System.out.println(pass);
            if(pass.equals(Pass)){
                correct = true;
            }else{
                correct = verifyLogisticPassword(username, Pass);
            }
        
            resultset.close();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return correct;
    }

    public int getUserID(String username){
        int id=0;
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "Select userid FROM User_  WHERE username = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, username);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    id = resultset.getInt("userid");
                }
                i++;
            }
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public int getLogisticID(String username){
        int id=0;
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "Select logisticID FROM LogisticService  WHERE logisticUsername = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, username);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    id = resultset.getInt("logisticID");
                }
                i++;
            }
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public int getLatestSchedularid(){ // test this function 
        int id=0;
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "Select Count(schedularid) AS count FROM Schedular";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    id = resultset.getInt("count");
                }
                i++;
            }
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
    public int getEventID(){
        int id=0;
        try {
            String sqlQuery = "Select Count(eventID) AS count FROM Event_";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            ResultSet resultset = pstmt.executeQuery();
            int i=0;
            while (resultset.next()) {
               // System.out.println(resultset.getString("username"));  
                if (i == 0){
                    id = resultset.getInt("count");
                }
                i++;
            }
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

// ----------- CREATING A NEW USER / SIGN UP-----------------------------------------------------

    //client signup
    public void signupClient(Client client){
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "Insert into Schedular() Values()";
            statement.executeUpdate(sqlQuery);

            sqlQuery = "Insert into  User_ (fullname, email, phoneno, username , password, usertype, schedularid) Values (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getFullname());
            pstmt.setString(2, client.getEmailmail());
            pstmt.setString(3, client.getPhoneNo());
            pstmt.setString(4, client.getUsername());
            pstmt.setString(5, client.getPassword());
            pstmt.setString(6, "Client");
            pstmt.setInt(7, getLatestSchedularid());
            pstmt.executeUpdate();
            System.out.println(client.getFullname() + client.getEmailmail()+client.getPassword());
            sqlQuery = "Insert into Client (userid) Values (?)";
            pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setInt(0, getUserID(client.getUsername()));
            pstmt.executeUpdate();
            statement.close();
            client.setUserID(getUserID(client.getUsername()));
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Event planner signup
    public void signupEventPlanner(EventPlanner planner){  // fix em when anum makes the stuff
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "Insert into Schedular() Values()";
            statement.executeUpdate(sqlQuery);
            
            sqlQuery = "Insert into  User_ (fullname, email, phoneno, username , password, usertype, schedularid) Values (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, planner.getFullname());
            pstmt.setString(2, planner.getEmailmail());
            pstmt.setString(3, planner.getPhoneNo());
            pstmt.setString(4, planner.getUsername());
            pstmt.setString(5, planner.getPassword());
            pstmt.setString(6, "Event Planner");
            pstmt.setInt(7, getLatestSchedularid());
            pstmt.executeUpdate();

            sqlQuery = "Insert into EventPlanner (userid, datesince, expertise, experience) Values(?,?,?,?)";
            pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setInt(1, getUserID(planner.getUsername()));
            Date sqlDate = new Date(planner.getStartDate().getTime());
            pstmt.setDate(2, sqlDate);
            pstmt.setString(3, planner.getExpertise());
            pstmt.setString(4, planner.getExperience());
            pstmt.executeUpdate();

            planner.setUserID(getUserID(planner.getUsername()));

            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Logistic Signup
    public void signupLogistic(Logistic logistic){ // edit db and code to make it
        try {
            Statement statement = cn.createStatement(); // portfolio peep peep
            String sqlQuery = "Insert into  LogisticService (logisticName, logisticEmail, logisticDesc, logisticType, logisticWebsite, logisticUsername, logisticPassword) Values (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, logistic.getCompanyName());
            pstmt.setString(2, logistic.getLogisticEmail());
            pstmt.setString(3, logistic.getCompanyDesc());
            pstmt.setString(4, logistic.getCompanyType());
            pstmt.setString(5, logistic.getWebsiteUrl());
            pstmt.setString(6, logistic.getUserName());
            pstmt.setString(7, logistic.getPassword());
            pstmt.executeUpdate();
            statement.close();
            logistic.setLogID(getLogisticID(logistic.getUserName()));
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
// -----------------END OF SIGNUPS----------------------------------------


 // --------------------UPDATING CLIENTS DATA--------------------------------   

    public void updateClientname(Client client){ // updated data is stored in the object
        try {
            String sqlQuery = "UPDATE User_ SET fullname = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getFullname());
            pstmt.setInt(2, getUserID(client.getUsername()));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateClientemail(Client client){
        try {
            String sqlQuery = "UPDATE User_ SET email = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getEmailmail());
            pstmt.setInt(2, getUserID(client.getUsername()));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClientPhoneNo(Client client){
        try {
            String sqlQuery = "UPDATE User_ SET phoneno = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getPhoneNo());
            pstmt.setInt(2, getUserID(client.getUsername()));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClientUser(Client client, String olduser){
        try {
            String sqlQuery = "UPDATE User_ SET username = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getUsername());
            pstmt.setInt(2, getUserID(olduser));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClientPassword(Client client){
        try { 
            String sqlQuery = "UPDATE User_ SET password = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getPassword());
            pstmt.setInt(2, getUserID(client.getUsername()));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
// --------------------END OF CLIENT UPDATES--------------------------------------


// ---------------UPDATING LOGISTICS DATA------------------------------------------
    public void updateLogisticCompName(Logistic logistic){
        try {
            String sqlQuery = "UPDATE LogisticService SET logisticName = ? WHERE logisticID = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, logistic.getCompanyName());
            pstmt.setInt(2, getLogisticID(logistic.getUserName()));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateLogisticCompEmail(Logistic logistic){
        try {
            String sqlQuery = "UPDATE LogisticService SET logisticEmail = ? WHERE logisticID = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, logistic.getLogisticEmail());
            pstmt.setInt(2, getLogisticID(logistic.getUserName()));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateLogisticURL(Logistic logistic){
        try {
            String sqlQuery = "UPDATE LogisticService SET logisticWebsite = ? WHERE logisticID = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, logistic.getWebsiteUrl());
            pstmt.setInt(2, getLogisticID(logistic.getUserName()));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateLogisticUser(Logistic logistic, String olduser){
        try {
            String sqlQuery = "UPDATE LogisticService SET logisticUsername = ? WHERE logisticID = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, logistic.getUserName());
            pstmt.setInt(2, getLogisticID(olduser));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateLogisticPass(Logistic logistic){
        try { 
            String sqlQuery = "UPDATE LogisticService SET logisticPassword = ? WHERE logisticID = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, logistic.getPassword());
            pstmt.setInt(2, getLogisticID(logistic.getUserName()));
            pstmt.executeUpdate();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

// ---------------END OF LOGISTICS UPDATES-----------------------------------------

//----------------UPDATING EVENT PLANNER DATA--------------------------------------

public void updatePlannerUser(EventPlanner planner, String olduser){   
    try { 
        String sqlQuery = "UPDATE User_ SET username = ? WHERE username = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, planner.getUsername());
        pstmt.setString(2, olduser);
        pstmt.executeUpdate();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}
public void updatePlannerPass(EventPlanner planner){
    try {
        String sqlQuery = "UPDATE User_ SET password = ? WHERE userid = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, planner.getPassword());
        pstmt.setInt(2, planner.getUserID());
        pstmt.executeUpdate();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}
public void updatePlannerName(EventPlanner planner){
    try {
        Statement statement = cn.createStatement(); 
        String sqlQuery = "UPDATE User_ SET fullname = ? WHERE userid = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, planner.getUsername());
        pstmt.setInt(2, planner.getUserID());
        pstmt.executeUpdate();
        statement.close();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}
public void updatePlannerEmail(EventPlanner planner){
    try {
        Statement statement = cn.createStatement(); 
        String sqlQuery = "UPDATE User_ SET email = ? WHERE userid = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, planner.getEmailmail());
        pstmt.setInt(2, planner.getUserID());
        pstmt.executeUpdate();
        statement.close();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}
public void updatePlannerPhone(EventPlanner planner){
    try {
        Statement statement = cn.createStatement(); 
        String sqlQuery = "UPDATE User_ SET phoneno = ? WHERE userid = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, planner.getPhoneNo());
        pstmt.setInt(2, planner.getUserID());
        pstmt.executeUpdate();
        statement.close();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}
public void updatePlannerDate(EventPlanner planner){
    try {
        Statement statement = cn.createStatement(); 
        String sqlQuery = "UPDATE EventPlanner SET datesince = ? WHERE userid = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        Date sqlDate = new Date(planner.getStartDate().getTime());
        pstmt.setDate(1, sqlDate);
        pstmt.setInt(2, planner.getUserID());
        pstmt.executeUpdate();
        statement.close();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}
public void updatePlannerExpertise(EventPlanner planner){
    try {
        Statement statement = cn.createStatement(); 
        String sqlQuery = "UPDATE EventPlanner SET expertise = ? WHERE userid = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, planner.getExpertise());
        pstmt.setInt(2, planner.getUserID());
        pstmt.executeUpdate();
        statement.close();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}
public void updatePlannerExperience(EventPlanner planner){
    try {
        Statement statement = cn.createStatement(); 
        String sqlQuery = "UPDATE EventPlanner SET experience = ? WHERE userid = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, planner.getExperience());
        pstmt.setInt(2, planner.getUserID());
        pstmt.executeUpdate();
        statement.close();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}

//-----------------END OF EVENT PLANNER UPDATES-------------------------------------

//---------------LOGING IN AS DIFF USERS--------------------------------------------

public void fillSchedular(Client client, String type, int schedularid){
    try {
        String sqlQuery = "Select * FROM Task WHERE schedularid = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setInt(1, schedularid);
        ResultSet resultset = pstmt.executeQuery();
        while (resultset.next()) {
           // System.out.println(resultset.getString("username"));  
           Task task = new Task();
        //    java.sql.Date sqlDate = resultset.getDate("dateadded");
        //    Date utilDate = new Date(resultset.getString("dateadded").getTime());
            task.setDate(resultset.getDate("dateadded"));
            task.setDesc(resultset.getString("taskdesc"));
            task.setStatus(resultset.getString("status"));
            task.setID(resultset.getInt("taskid"));
            client.addTask(task);
        }
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}

public void fillClientEvents (Client client){
    try {
        String sqlQuery = "Select * FROM Event WHERE userID = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setInt(1, client.getUserID());
        ResultSet resultset = pstmt.executeQuery();
        while (resultset.next()) {
            EventRequirements eventRequirements = new EventRequirements();
            sqlQuery = "select * from ReqList where eventreqsID = ?";
            PreparedStatement pstmt1 = cn.prepareStatement(sqlQuery);
            pstmt1.setInt(1, resultset.getInt("eventReqsID"));    
            ResultSet rs = pstmt1.executeQuery();
            while(rs.next()){
                eventRequirements.createRequirement(rs.getString(" eventReqDesc"), rs.getInt("reqID"));
            }
            Budget budget = new Budget();
            sqlQuery = "selet * from Budgetitem where budgetID = ?";
            PreparedStatement pstmt2 = cn.prepareStatement(sqlQuery);
            pstmt1.setInt(1, resultset.getInt("budgetID"));    
            ResultSet rs2 = pstmt2.executeQuery();
            while (rs2.next()){ // HERE ----aslk,bdkjwva 
                budget.createBudgetItem(rs2.getString("itemdesc"), getLatestSchedularid(), getLatestSchedularid(), getLatestSchedularid());
            }
          // client.createEventSql(resultset.getString("eventName"), resultset.getDate("dateofevent"), resultset.getString("timeofevent"), resultset.getString("eventSize"), null, null, null, null, resultset.getString("eventID")));
            
            pstmt1.close();
            pstmt2.close();
        }
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}

public Client LoginClient(String username){
    Client client = new Client();
    int schedularid=0;
    try {
        String sqlQuery = "Select * FROM User_ WHERE username = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, username);
        ResultSet resultset = pstmt.executeQuery();
        int i=0;
        while (resultset.next()) {
           // System.out.println(resultset.getString("username"));  
            if (i == 0){
                client.setUserID(resultset.getInt("userid"));
                client.setFullname(resultset.getString("fullname"));
                client.setEmail(resultset.getString("email"));
                client.setPhoneNo(resultset.getString("phoneno"));
                client.setUsername(resultset.getString("username"));
                client.setPassword(resultset.getString("password"));
                schedularid = resultset.getInt(schedularid);
            }
            i++;
        }
        fillSchedular(client, "Client" , schedularid);
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
    return client;
}

//------------------END OF LOGINS---------------------------------------------------

public void createEventbyClient(Event event, int id){
     try {
        String sqlQuery = "Insert into  Event_ (eventName, dateofevent, timeofevent, eventSize, clientid) Values (?,?,?,?,?)";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, event.getTitle());
        Date sqlDate = new Date(event.getDate().getTime());
        pstmt.setDate(2, sqlDate);
        pstmt.setString(3, event.getTime());
        pstmt.setInt(4, event.getSize());
        pstmt.setInt(5, id);

        pstmt.executeUpdate();
        event.setEventID(getEventID());
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }

}   

public void updateEventTitle(Event event){
    try { 
        String sqlQuery = "UPDATE Event_ SET eventName = ? WHERE eventID = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, event.getTitle());
        pstmt.setInt(2, event.getEventID());
        pstmt.executeUpdate();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}

public void updateEventdate(Event event){
    try { 
        String sqlQuery = "UPDATE Event_ SET dateofevent = ? WHERE eventID = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        Date sqlDate = new Date(event.getDate().getTime());
        pstmt.setDate(1, sqlDate);
        pstmt.setInt(2, event.getEventID());
        pstmt.executeUpdate();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}

public void updateEventSize(Event event){
    try { 
        String sqlQuery = "UPDATE Event_ SET eventSize = ? WHERE eventID = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setInt(1, event.getSize());
        pstmt.setInt(2, event.getEventID());
        pstmt.executeUpdate();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}

public void updateEventTime(Event event){
    try { 
        String sqlQuery = "UPDATE Event_ SET timeofevent = ? WHERE eventID = ?";
        PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
        pstmt.setString(1, event.getTime());
        pstmt.setInt(2, event.getEventID());
        pstmt.executeUpdate();
        // cn.close(); auto closes when the the object is closed
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
}



    public void testing()
    {
        try {
            //Connection cn = DriverManager.getConnection(jdbcUrl, username, password);
        
            // Create a statement object
            Statement statement = cn.createStatement();
        
            // Execute the query
            String sqlQuery = "select * from User_ where userid =1";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
        
            // Process the query results
            while (resultSet.next()) {
                System.out.println(resultSet.getString("fullname"));  
            }
        
            // Close the resources
            resultSet.close();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            // Handle any potential errors that might occur during connection or query execution
            e.printStackTrace();
        }
    }
}
    // Close the resources

    // resultSet.close();
    // statement.close();
    // cn.close();
    //     Statement mystmt = cn.createStatement();
    //     ResultSet myRs = mystmt.executeQuery("select from* user where userid =1");
    //     while(myRs.next()){
    //         System.out.println(myRs.getString("fullname"));
    //     }
    // }
    // public static void main (String [] args) {
    //     Connection myconn = null;
    //     Statement mystmt = null;
    //     ResultSet myRs = null;
    //     String user ="root";
    //     String pass="12345";
    //     try {
    //         myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", user , pass);
    //         mystmt = myconn.createStatement();
    //         myRs = mystmt.executeQuery("select * from world.city");
    //         while (myRs.next())
    //         {
    //             System.out.println(myRs.getString("ID"));
    
    //         }
    //     }
    //     catch(Exception exc){
    //         exc.printStackTrace();
    //     }
    //     finally {
    //         if (myRs != null){
    //             try {
    //                 myRs.close();
    //             } catch (SQLException e) {
    //                 // TODO Auto-generated catch block
    //                 e.printStackTrace();
    //             }
    //         }
    //     } 

    // }
    