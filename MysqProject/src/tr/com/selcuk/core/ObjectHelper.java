package tr.com.selcuk.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObjectHelper {
	private String userName="root";
	private String password="";

	private String url="jdbc:mysql://localhost:3306/demo";
	private static String driver="com.mysql.jdbc.Driver";
	
	
	static {
		try {
			Class.forName(driver);
			System.out.println("ba�ar�l�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ba�ar�s�z..");
			e.printStackTrace();
		}
	}

	
	protected Connection getConnection() {
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return connection;
		
		
	}
}
