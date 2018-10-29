package com.kat.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	/**
	 * Fetch Database Connection Whenever this method is called; closeConnection
	 * method should also be called after the query processing
	 */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(
					"jdbc:sqlserver://localhost;databaseName=MyDatabaseForTesting;integratedSecurity=true");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			//System.exit(0);
		}
		return connection;
	}

	/**
	 * Close the connection passed in parameter
	 */
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			//System.exit(0);
		}
	}
}
