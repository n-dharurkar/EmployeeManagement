package empapp;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	static Connection con;
	public static Connection createDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employeedb?useSSL=false";
			String username="root";
			String password="Niraj@812002";
			con = DriverManager.getConnection(url,username,password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
