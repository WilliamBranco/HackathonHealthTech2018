package org.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//classe de conexão
public class ConnectionFactory{

	public static Connection conn;

	//construtor da conexão
	public static Connection getConnection()
		throws SQLException, ClassNotFoundException{

		if(conn == null){
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.
				getConnection("jdbc:mysql://localhost/test_lpw", "root", "");
		}

		return conn;
	}

}

