package com.fourserve.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcApp01 {

	public static void main(String[] args) throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe", "system", "mahesh");
		Statement st=con.createStatement();
		String query="create table emp2(ENO number primary key, ENAME varchar2(10),ESAL float,EADDR varchar2(10))";
			st.executeUpdate(query);
			System.out.println("table emp1 created successfully");
			st.close();
			con.close();

	}

}
