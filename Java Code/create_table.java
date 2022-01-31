package com.company;

import java.sql.*;

public class create_table
{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/students";
	static final String USER = "root";
	static final String PASS = "manushri143*";
    public static void main(String args[])
    {
        Connection conn = null;
        Statement stmt = null;
        String CreateSql = null;
    try
    {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Database Connected ..");
            stmt = conn.createStatement();
            CreateSql = "Create Table Student ( roll_no numeric primary key, stu_name varchar(40), "
            		+ "stu_address varchar(200))" ;
            stmt.executeUpdate(CreateSql);
    }
    catch (Exception e)
    {
        System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        System.exit(0);
    }
      	System.out.println("Table Created successfully");
    }
}