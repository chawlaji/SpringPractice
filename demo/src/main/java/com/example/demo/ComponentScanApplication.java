package com.example.demo;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.componentscan.ComponentDao;


@SpringBootApplication
@ComponentScan("com.example.componentscan")
public class ComponentScanApplication {
	private static Logger LOGGER=LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());
		
		ApplicationContext appcontext= SpringApplication.run(ComponentScanApplication.class, args);
		ComponentDao componentDao1 = appcontext.getBean(ComponentDao.class);
		
		
		LOGGER.info("{}", componentDao1);
		
	}
}
