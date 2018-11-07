package com.jpa.jpademo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class JpaDemoApplicationTests {

    @Test
    public void contextLoads() throws SQLException {
    	HikariConfig config = new HikariConfig();
    	config.setMaximumPoolSize(100);
    	config.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
    	config.addDataSourceProperty("serverName", "localhost");
    	config.addDataSourceProperty("port", "3306");
    	config.addDataSourceProperty("databaseName", "aiways");
    	config.addDataSourceProperty("user", "root");
    	config.addDataSourceProperty("password", "root");
    	config.addDataSourceProperty("useSSL", false);

    	HikariDataSource ds = new HikariDataSource(config);
    	java.sql.Connection connection =null;
    	java.sql.Statement statement =null;
    	try {
			connection  = ds.getConnection();
			statement= connection.createStatement();
			ResultSet set = statement.executeQuery("Select * from auth_user");
			while(set.next()) {
				System.out.println(set.getString("auth_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			statement.close();
			ds.close();
		}
    }

}
