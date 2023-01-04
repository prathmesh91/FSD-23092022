package com.todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.todo.dto.TaskBean;

public class ToDoModel {
	
	private Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	} 

	public boolean save(TaskBean bean) {
		boolean result = false;
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement("insert into task(title,status,scheduledOn) values(?,?,?)");
			stmt.setString(1, bean.getTitle());
			stmt.setString(2, bean.getStatus());
			stmt.setString(3, bean.getScheduledOn());
			int count = stmt.executeUpdate();
			result = count>0;
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
