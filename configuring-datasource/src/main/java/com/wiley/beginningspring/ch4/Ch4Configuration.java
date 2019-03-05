package com.wiley.beginningspring.ch4;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Ch4Configuration {
	//use this for h2 database 
	//    @Bean
	//    public DataSource dataSource() {
	//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	//        dataSource.setDriverClassName("org.h2.Driver");
	//        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	//        dataSource.setUsername("sa");
	//        dataSource.setPassword("");
	//        return dataSource;
	//    }
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource ; 
	}
}
