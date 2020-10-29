package com.example.demo.Service;

import java.sql.*;

public class UserConnection {
	Connection c;
	Statement s;
	public UserConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql:///company","root","password");
			s=c.createStatement();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
