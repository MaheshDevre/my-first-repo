package com.fourserve.jdbc;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcApp02 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "system", "mahesh");
			st=con.createStatement();
			String query="create table emp1(ENO number(3) primary key, ENAME varchar2(10),ESAL float,EADDR varchar2(10))";
			st.executeUpdate(query);
			System.out.println("table emp1 created successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
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
