package locadora.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC {

	public Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MVC?useSSL=false&serverTimezone=UTC", "dev", "projeto2026");
		} catch (SQLException e) {
			System.err.println("Erro de conexão ao banco MySQL: " + e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

}
