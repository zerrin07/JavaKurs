package ihtiyactan;

import java.sql.*;

public class DBOperation {
	static Connection conn = null;
	public static void connect() {
		String url = "jdbc:postgresql:ihtiyactan";
		String user = "postgres";
		String password = "A123456";

    	try {
    		conn = DriverManager.getConnection(url, user, password);
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    	}
	}
	
	public static ResultSet returnRS(String stmt) {
		try {
			connect();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(stmt);
			return rs;
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static int Save(String stmt) {
		try {
			
			connect();
			Statement st = conn.createStatement();
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

