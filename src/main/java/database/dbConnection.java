package database;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class dbConnection {
	public static DriverManagerDataSource getDS(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/Desastres");
		dataSource.setUsername("root");
		dataSource.setPassword("Flo062324");
		return dataSource;
	}
}
