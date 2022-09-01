package com.foureserve.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class jdbcApp06 {

	public static void main(String[] args) {
		Scanner sc=null;
		Connection con=null;
		Statement st=null;
		try
		{
			DriverManager.registerDriver(new OracleDriver());
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "system", "mahesh");
			st=con.createStatement();
			
			sc=new Scanner(System.in);
			System.out.println("Salary Range  : ");
			float sal_Range=sc.nextFloat();
			System.out.println("Bonus Amount  :");
			int bonus_Amt=sc.nextInt();
			
			int rowCount=st.executeUpdate("update emp1 set ESAL=ESAL  + "+ bonus_Amt + "where ESAL < " + sal_Range);
			System.out.println("Records Updated : "+rowCount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				sc.close();
				st.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
