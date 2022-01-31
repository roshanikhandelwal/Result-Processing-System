package com.company;

//This file connects Java application to Postgresql Database using JDBC Driver!

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    static Connection con;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/rps";
	static final String USER = "root";
	static final String PASS = "manushri143*";
    public static void main(String[] args) {
	// write your code here
        try{
        	Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected Successfully!");
            if(con.isClosed()){
                System.out.println("Connection is still closed!");
            }else{
                System.out.println("Connected....");
            }
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": "+e.getMessage());
            System.exit(0);
        }

        StudentLogic sl = new StudentLogic();
        sl.setVisible(true);
  
        sl.setBounds(600,100,400,500);
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

