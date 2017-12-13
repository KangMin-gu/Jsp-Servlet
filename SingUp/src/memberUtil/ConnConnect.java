package memberUtil;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnConnect {
	private Connection conn;

	public ConnConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "jsp", "jsp");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public Connection getConn() {
		return conn;
	}
}
