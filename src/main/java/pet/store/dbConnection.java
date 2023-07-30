package pet.store;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class dbConnection {
	private static String HOST = "localhost";
	private static String PASSWORD = "pet_store";
	private static int PORT = 3306;
	private static String SCHEMA = "pet_store";
	private static String USER = "pet_store";
	
	
	

	public static Connection getConnection() {
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",  HOST, PORT, SCHEMA, USER, PASSWORD);
		
		try {
			Connection conn = DriverManager.getConnection(uri);
			System.out.println("Connection to schema '" + SCHEMA + " 'is successful.");
			return conn;
		} catch (SQLException e) {
			System.out.println("Unable to get connection at " + uri);
			throw new dbException("Unable to get connection at \" + uri");
	
		}
	}
}	


