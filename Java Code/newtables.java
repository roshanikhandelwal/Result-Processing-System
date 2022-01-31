package com.company;
import java.sql.*;
import java.util.*;


public class newtables
{
    public static void main(String args[])
    {
    	try{
	Scanner sc = new Scanner(System.in);
	DATA_de d = new DATA_de();	
        Connection c = null;
        Statement stmt = null;
    	String CreateSql = null;

	Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/rps", "root", "manushri143*");
        System.out.println("Database Connected ..");
	int a = 0 ;
	while(a!=-1)
	{
    		System.out.println("choose an action: 1) Create Table...2)Add values..3) display...");
		a = sc.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("\n");
				DATA_de.table_Cre();
				break;
			case 2:
				System.out.println("\n");
				DATA_de.insert_val();
				break;
			case 3:     
				System.out.println("\n"); 
				DATA_de.display();
				break;
			default:
				System.out.println("Enter values between 1-3");
			
		}
	}
	
    		} catch (Exception e){
        			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        			System.exit(0);
        		}	
	    }
	

}