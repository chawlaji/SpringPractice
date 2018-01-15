package com.example.demo.scope;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonDao {
	
	@Autowired
	JdbcConnection jdbcconnection;

	public JdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setJdbcconnection(JdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}
	

}