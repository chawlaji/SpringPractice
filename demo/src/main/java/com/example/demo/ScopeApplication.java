package com.example.demo;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.basics5.scope.PersonDao;


@SpringBootApplication
public class ScopeApplication {
	private static Logger LOGGER=LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());
		
		ApplicationContext appcontext= SpringApplication.run(ScopeApplication.class, args);
		PersonDao personDao1 = appcontext.getBean(PersonDao.class);
		PersonDao personDao2 = appcontext.getBean(PersonDao.class);
		
		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcconnection());
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcconnection());
		
	}
}
