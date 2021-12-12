package com.jdbc.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDatabase {
	
	private static Connection connection = null;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		StudentDatabase studentDatabase = new StudentDatabase();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
			String username = "root";
			String password = "ayush";
			
			connection = DriverManager.getConnection(dbURL,username,password);
			
			System.out.println("Enter Choice: ");
			System.out.println("1. Insert Record: ");
			System.out.println("2. Select Record: ");
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			
			switch(choice) {
			case 1:
				studentDatabase.insertRecord();
				break;
			case 2:
				studentDatabase.selectRecord();
				break;
			default:
				break;
			}
		}catch(Exception e) {
			throw new RuntimeException("Something went wrong");
		}
		

	}
	
	private void insertRecord() throws SQLException {
		//For Manual Inserting
		System.out.println("Inside Insert record");
		String sql = "insert into Student(school_name,location) values ('VIT','SJT')" ;
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int rows = preparedStatement.executeUpdate();
		
		//For User Input Basis
//		String sql = "insert into Student(school_name,location) values (?,?)" ;
//		PreparedStatement preparedStatement = connection.prepareStatement(sql);
//		System.out.println("Enter School Name");
//		preparedStatement.setString(1, scanner.nextLine());
//		System.out.println("Enter Location");
//		preparedStatement.setString(2, scanner.nextLine());
//		int rows = preparedStatement.executeUpdate();
//      If double then it would have been
//		preparedStatement.setDouble(2,Duble.parseDouble(scanner.nextLine()));
		
		if(rows>0) {
			System.out.println("Record inserted successfully");
		}
	}
	
	public void selectRecord() throws SQLException {
		String sql = "select* from Student where location='SJT'";
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		//For Single Record use this command
//		if(result.next()) {
//			String school_name = result.getString("school_name");
//			String location = result.getString("location");
//			System.out.println("School Name with location "+location+" is "+school_name);
//		}else {
//			System.out.println("No records found");
//		}
		
		//For Multiple Records use this command
		while(result.next()) {
			String school_name = result.getString("school_name");
			String location = result.getString("location");
			
			System.out.println("School Name with location "+location+" is "+school_name);
		}
	}

}
