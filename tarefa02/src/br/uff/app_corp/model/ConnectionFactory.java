package br.uff.app_corp.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter", "root", "Root123!" );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
