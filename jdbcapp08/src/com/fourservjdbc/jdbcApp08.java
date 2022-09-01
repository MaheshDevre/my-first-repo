package com.fourservjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcApp08 {

	public static void main(String[] args)
	{
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "system", "mahesh");
			st=con.createStatement();
			
			int row_Count1=st.executeUpdate("create table emp10(ENO number(3) primary key,ENAME varchar2(10))");
			System.out.println(row_Count1);
			
			int row_Count2=st.executeUpdate("drop table emp10");
			System.out.println(row_Count2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				con.close();
				st.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
   
	}

}
