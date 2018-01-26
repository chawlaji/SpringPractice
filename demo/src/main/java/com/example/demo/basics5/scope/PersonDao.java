package com.example.demo.basics5.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
