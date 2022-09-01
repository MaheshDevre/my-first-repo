package com.fourserve.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcApp04 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		BufferedReader br=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "system", "mahesh");
			st=con.createStatement();
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Table Name : ");
			String tname=br.readLine();
			String primary_Key_Cols="";
			String query="";
			query=query + "create table "+tname+"(";
			int primary_Key_Count=0;
			while(true)
			{
				System.out.println("Column Name           :");
				String col_Name=br.readLine();
				System.out.println("Column Data Type and Size");
				String col_Type_Size=br.readLine();
				System.out.println("It is Primary Key Column[yes/no] :");
				String primary_Key_Option=br.readLine();
				if(primary_Key_Option.equalsIgnoreCase("yes"))
				{
					primary_Key_Count = primary_Key_Count+1;
					if(primary_Key_Count == 1)
					{
						primary_Key_Cols = primary_Key_Cols + col_Name;
					}
					else
					{
						primary_Key_Cols = primary_Key_Cols + "," + col_Name;
					}
					
				}
				query = query + col_Name + " "+col_Type_Size;
				System.out.println("Onemore Coumn? [yes/no]   : ");
				String option = br.readLine();
				if(option.equalsIgnoreCase("yes"))
				{
					query = query + ",";
					continue;
				}
				else
				{
					query = query + "," + "primary key(" + primary_Key_Cols +"))";
					break;
				}
				
			}
			st.executeUpdate(query);
			System.out.println("Table "+tname+" is Craeted Successfully");
			System.out.println(query);		
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
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
