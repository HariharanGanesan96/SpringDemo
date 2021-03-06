package com.chainsys.pet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.pet.encrpt.EncryptPassword;
import com.chainsys.pet.logger.Logger;



public class ConnectionUtil {

	public static Connection getDbConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String userName = "system";
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", userName,
					EncryptPassword.decrypt());
		} catch (ClassNotFoundException | SQLException e) {
			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());
		} catch (Exception e1) {
			Logger.printStackTrace(e1);
			Logger.runTimeException(e1.getMessage());
		}
		return null;
	}
	
	public static void close(ResultSet resultSet,PreparedStatement preparedStatement,Connection connection) {
		try {
		if (resultSet != null) {
			resultSet.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}}catch (SQLException e) {
		}		
	}
	private ConnectionUtil() {
		super();
	}
}
