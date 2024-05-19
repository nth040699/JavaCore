package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	private static String DB_URL = "jdbc:sqlserver://localhost:1433;" + "databaseName=DatVe;";
	private static String USER_NAME = "sa";
	private static String PASSWORD = "123";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
//			System.out.println("connect successfully!");
		} catch (Exception ex) {
//			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		getConnection();
		System.out.println("Success");
	}
}
