package com.sus.sushma;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Sports {
	public static void SportsBatch() throws ClassNotFoundException,SQLException {
	
	String sql = "insert into Sports_table value(4321,'throball','outdoor',8)";
	String sql1 = "insert into Sports_table value(1421,'chess','Indoor',2)";
	String sql2 = "insert into Sports_table value(6456,'chinetanda','outdoor',10)";
	String sql3 = "insert into Sports_table value(6752,'lagori','outdoor',8)";
	 try(java.sql.Connection con=DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jdbc_connection?user=root&password=root123");){
		 	//con.setAutoCommit(false); 
		try(Statement stmt = con.createStatement();){
			stmt.addBatch(sql);
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			int a[]=stmt.executeBatch();
			for(int i:a) {
				System.out.println(i);
				
			}
			con.commit();
			stmt.close();
		}
		 con.close();
		 
	 }
}
	public static void main(String[] args) {
	
		try {
			Sports.SportsBatch();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
			
		
	}
}


