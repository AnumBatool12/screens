package com.example;
import java.sql. * ;

public class MySqlClass {
    private MySqlConnection cn;
    private String ConnectionString;
    private static MySqlClass instance;

    private MySqlClass(){
        instance = NULL;
    }
    public void MyConnection()
    {
        con = "server=localhost;uid=root;pwd=Saikobaka002;database=finalproject";
        cn.ConnectionString = con;
        cn.Open();
        ConnectionString = con;
    }
    public static MySqlClass getInstance(){
        if(instance.equals(NULL)){
            instance = new MySql();
            instance.MyConnection;
            return instance;
        }
        else{
            return instance;
        }
    }

    public void testing(){
        Statement mystmt = cn.createStatement();
        ResultSet myRs = mystmt.executeQuery("select from* user where userid =1");
        while(myRs.next()){
            System.out.println(myRs.getString("fullname"));
        }
    }
    ~MySql(){
        cn.close();
    }

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
}
