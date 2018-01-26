package com.example.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDao {
	
	@Autowired
	ComponentJdbcConnection jdbcconnection;

	public ComponentJdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setJdbcconnection(ComponentJdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}

	
	

}
