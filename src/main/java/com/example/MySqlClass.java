package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
 
 
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
                type = "logistic";
            }
        }
        return type;
    }

    public boolean verifyLogisticPassword(String username){
        boolean correct = false;
        try {
            Statement statement = cn.createStatement();
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

            if(pass.equals(username)){
                correct = true;
            }else{
                correct = false;
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

    public boolean verifyPassword(){
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

            if(pass.equals(username)){
                correct = true;
            }else{
                correct = verifyLogisticPassword(username);
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

// ----------- CREATING A NEW USER / SIGN UP-----------------------------------------------------

    //client signup
    public void signupClient(Client client){
        try {
            Statement statement = cn.createStatement();
            String sqlQuery = "Insert into  User_ (fullname, email, phoneno, username , password, usertype) Values (?,?,?,?,?,?)";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getFullname());
            pstmt.setString(2, client.getEmailmail());
            pstmt.setString(3, client.getPhoneNo());
            pstmt.setString(4, client.getUsername());
            pstmt.setString(5, client.getPassword());
            pstmt.setString(6, "Client");
            pstmt.executeQuery();
            statement.close();
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
            String sqlQuery = "Insert into  User_ (fullname, email, phoneno, username , password, usertype) Values (?,?,?,?,?,?)";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, planner.getFullname());
            pstmt.setString(2, planner.getEmailmail());
            pstmt.setString(3, planner.getPhoneNo());
            pstmt.setString(4, planner.getUsername());
            pstmt.setString(5, planner.getPassword());
            pstmt.setString(6, "EventPlanner");
            pstmt.executeQuery();

            sqlQuery = "Insert into EventPlanner (userid, datesince, expertise, experience) Values(?,?,?,?)";
            pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setInt(1, getUserID(planner.getUsername()));

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
            String sqlQuery = "Insert into  LogisticService (logisticName, logisticDesc, logisticType, logisticUsername, logisticPassword) Values (?,?,?,?,?,?)";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, logistic.getCompanyName());
            pstmt.setString(2, logistic.getCompanyDesc());
            pstmt.setString(3, logistic.getCompanyType());
            pstmt.setString(4, logistic.getUserName());
            pstmt.setString(5, logistic.getPassword());
            pstmt.executeQuery();
            statement.close();
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
            Statement statement = cn.createStatement();
            String sqlQuery = "UPDATE User_ SET fullname = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getFullname());
            pstmt.setInt(2, getUserID(client.getUsername()));
            pstmt.executeQuery();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateClientemail(Client client){
        try {
            Statement statement = cn.createStatement(); 
            String sqlQuery = "UPDATE User_ SET email = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getEmailmail());
            pstmt.setInt(2, getUserID(client.getUsername()));
            pstmt.executeQuery();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClientPhoneNo(Client client){
        try {
            Statement statement = cn.createStatement(); 
            String sqlQuery = "UPDATE User_ SET phoneno = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getPhoneNo());
            pstmt.setInt(2, getUserID(client.getUsername()));
            pstmt.executeQuery();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClientUser(Client client, String olduser){
        try {
            Statement statement = cn.createStatement(); 
            String sqlQuery = "UPDATE User_ SET username = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getUsername());
            pstmt.setInt(2, getUserID(olduser));
            pstmt.executeQuery();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClientPassword(Client client){
        try {
            Statement statement = cn.createStatement(); 
            String sqlQuery = "UPDATE User_ SET password = ? WHERE userid = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, client.getPassword());
            pstmt.setInt(2, getUserID(client.getUsername()));
            pstmt.executeQuery();
            statement.close();
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
            Statement statement = cn.createStatement(); 
            String sqlQuery = "UPDATELogisticService SET logisticName = ? WHERE logisticID = ?";
            PreparedStatement pstmt = cn.prepareStatement(sqlQuery);
            pstmt.setString(1, logistic.getCompanyName());
            pstmt.setInt(2, getUserID(logistic.getCompanyDesc()));
            pstmt.executeQuery();
            statement.close();
            // cn.close(); auto closes when the the object is closed
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateLogisticCompEmail(){

    }

    public void updateLogisticURL(){

    }

    public void updateLogisticCompUser(){

    }

    public void updateLogisticCompPass(){

    }

// ---------------END OF LOGISTICS UPDATES-----------------------------------------

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
    