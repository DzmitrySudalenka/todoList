package by.gsu.epamlab.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.gsu.epamlab.Constants;

public class DBManager {
	static {
		try {
			Class.forName(Constants.DB_DRIVER);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(Constants.REPORT_LOAD);
		}
	}
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(Constants.DB_URL, Constants.DB_LOGIN, 
				Constants.DB_PASSWORD);
	}
	public static void closeConnection(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			System.err.println(Constants.REPORT_RESOURCE_CLOSE + e);
		}
	}
	public static void closeStatements(Statement... statements) {
		for (Statement statement : statements) {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				System.err.println(Constants.REPORT_RESOURCE_CLOSE + e);
			}
		}
	}
	public static void closeResultSets(ResultSet... resultSets) {
		for (ResultSet resultSet : resultSets) {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				System.err.println(Constants.REPORT_RESOURCE_CLOSE + e);
			}
		}
	}
}
