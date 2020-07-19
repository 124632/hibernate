package com.sus.sushma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Cabs {
	public static void cabtable() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cab number:");
		int cab_num=sc.nextInt();
		System.out.println("enter cab name:");
		String cab_name=sc.next();
		System.out.println("enter cab source");
		String cab_source=sc.next();
		System.out.println("enter cab destination");
		String cab_dest=sc.next();
		
		try(Connection con= DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jdbc_connection?user=root&password=root123");){
			try(PreparedStatement preparedstatement=con.prepareStatement("insert into cabs_table values(?,?,?,?)")){
				
				preparedstatement.setInt(1, cab_num);
				preparedstatement.setString(2, cab_name);
				preparedstatement.setString(3, cab_source);
				preparedstatement.setString(4, cab_dest);
				preparedstatement.addBatch();
				int a[]= preparedstatement.executeBatch();
				for(int i:a) {
					System.out.println(i);
				}
			}
			try(PreparedStatement preparedstatement=con.prepareStatement("insert into cabs_table values(?,?,?,?)")){
				preparedstatement.setInt(1, cab_num);
				preparedstatement.setString(2, cab_name);
				preparedstatement.setString(3, cab_source);
				preparedstatement.setString(4, cab_dest);
				preparedstatement.addBatch();
				int a[]= preparedstatement.executeBatch();
				for(int i:a) {
					System.out.println(i);
				}
					
			}
try(PreparedStatement preparedstatement=con.prepareStatement("insert into cabs_table values(?,?,?,?)")){
				
				preparedstatement.setInt(1, cab_num);
				preparedstatement.setString(2, cab_name);
				preparedstatement.setString(3, cab_source);
				preparedstatement.setString(4, cab_dest);
				preparedstatement.addBatch();
				int a[]= preparedstatement.executeBatch();
				for(int i:a) {
					System.out.println(i);
				}
			}
				}
	}
	
	public static void main(String[] args) {
		 
		
		try {
			Cabs.cabtable();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
