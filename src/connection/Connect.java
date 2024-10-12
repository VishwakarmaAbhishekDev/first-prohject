package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	private static String url = "";
	private static String username = "root";
	private static String password = "Abhi@d123";
	
	public static Connection getConnection() {
		
		Connection connection = null;
		
		try {
			 connection = DriverManager.getConnection(url,username,password);
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
		return connection;
		}
	
	
	
}
