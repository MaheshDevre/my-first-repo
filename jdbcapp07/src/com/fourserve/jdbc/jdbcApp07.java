package com.fourserve.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class jdbcApp07 {

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
			System.out.print("Salary Range  : ");
			float sal_Range=sc.nextFloat();
			
			int row_Count=st.executeUpdate("delete from emp1 where ESAL < "+sal_Range);
			System.out.print("Records Deleted  : "+row_Count);
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
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
