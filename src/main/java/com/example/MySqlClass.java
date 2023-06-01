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
                System.out.println(resultset.getString("username"));  
                if (i == 0){
                    user = resultset.getString("username");
                    System.out.println(user);
                }
                i++;
            }

            if(user.equals(username)){
                exists = true;
                System.out.println("yes");
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

    public char userType(){
        char type = 's';

        return type;
    }

    public boolean verifyPassword(){
        boolean correct = false;

        return correct;
    }

    public void updateUsername(){

    }

    public void updatePassword(){

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
    