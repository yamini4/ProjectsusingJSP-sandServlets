package com.simplilearn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	final static String DRIVER_CLASS="com.mysql.jdbc.Driver";
	final static String DB_URL="jdbc:mysql://localhost:3306/db2";
	final static String USER_NAME="root";
	final static String PASSWORD="Yummy@123";
	
	public static Connection getConn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
		return con;
	}
	
}


