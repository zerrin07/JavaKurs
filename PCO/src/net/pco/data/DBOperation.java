package net.pco.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperation {
	private static String url = "jdbc:postgresql:shop";
	private static String user = "postgres";
	private static String password = "A123456a";

	static Connection cn = null;
	
	private static void connect() {
		try {
			cn = DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static ResultSet returnRS(String sql) {
		connect();
		ResultSet rs = null;
		try {
			Statement st = cn.createStatement();
			rs = st.executeQuery(sql);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rs;
	}
	
	public static int Save(String stmt) {
		try {
			connect();
			Statement st = cn.createStatement();
			int affectedRows = st.executeUpdate(stmt, 0);
			if(affectedRows == 1) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					return rs.getInt(1);
				}
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
}
