package com.sus.sushma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class Airlines {
	public static void main(String[] args) {
		Connection con1 = null;
		//Statement stmt = null;
		java.sql.PreparedStatement pstmt=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		int id=sc.nextInt();
		String name=sc.next();
		String type=sc.next();
		String source=sc.next();
		String dest=sc.next();
		
		try {
	
			Class.forName("com.mysql.jdbc.Driver");
			//load and register the Driver with the help of registerDriver which is DriverManager(helper class)
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			con1 = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_connection?user=root&password=root123");
			
			pstmt=con1.prepareStatement("insert into airlines_table value(?,?,?,?,?)");
			//pstmt=con.prepareStatement("aletr table airline_table rename airlines_table");
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, type);
			pstmt.setString(4, source);
			pstmt.setString(5, dest);
			pstmt.executeUpdate();
			
			//stmt = con1.createStatement();
//stmt.execute("insert into airlines_table value(1,'emirates','international','kia','us')");
		//stmt.execute("update airlines_table set airlines_type='domestic' where airlines_name='emirates'");
//stmt.execute("insert into airlines_table value(3,'indigo','domestic','kia','australiya')");
//stmt.execute("delete from airlines_table where airlines_id=1");
//stmt.execute("insert into airlines_table value(8,'indigo','domestic','kia','uk')");
  /* ResultSet rs = stmt.executeQuery("select * from airlines_table");// where airlines_id=4
   while(rs.next())   //if(rs.absolute(6))-->this is use middle & need absolute row
   {
	   int id = rs.getInt(1);
	   String name = rs.getString(2);
	   String type = rs.getString(3);
	   String source = rs.getString(4);
	   String dest = rs.getString(5);
   
   System.out.println(id+" "+name+" "+type+" "+source+" "+dest);
   }*/
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
			
		}finally {
			
			Connection stmt = null;
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(con1!=null) {
					try {
						con1.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
		}
	}

}
