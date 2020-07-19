package com.sus.sushma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Restaurant {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_connection?user=root&password=root123");
			Statement stmt = con.createStatement();
			stmt.execute("insert into restaurant_table values(1,'taj','yashwanthpur')");
			con.close();
			stmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
