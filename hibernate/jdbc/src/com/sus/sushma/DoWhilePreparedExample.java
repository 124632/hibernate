package com.sus.sushma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class DoWhilePreparedExample {
       public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedstatement=null;
		char repeat='y';
		Scanner sc=new Scanner(System.in);
		try {
		 connection= DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_connection?user=root&password=root123");{
				preparedstatement= (PreparedStatement) connection.prepareStatement("insert into student_table value(?,?,?,?)");
				do {
					System.out.println("enter student id");
					int id=sc.nextInt();
					System.out.println("enter student name");
					String name=sc.next();
					System.out.println("enter student college name");
					String collegeName=sc.next();
					System.out.println("enter student email");
					String email=sc.next();
					
					preparedstatement.setInt(1, id);
					preparedstatement.setString(2, name);
					preparedstatement.setString(3, collegeName);
					preparedstatement.setString(4, email);
					int i=preparedstatement.executeUpdate();
					System.out.println(i+"student record affected..");
					
					System.out.println("Do you want to continue..");
					repeat=sc.next().charAt(0);
				
				}while(repeat =='y' || repeat =='y');
				}
					}catch(SQLException e) {
						e.printStackTrace();
					}finally {
				try {
					if(connection!=null&&preparedstatement!=null&&sc!=null) {
						preparedstatement.close();
						connection.close();
						sc.close();
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		
     }

		
}