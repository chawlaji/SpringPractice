package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.basics5.cdi.SomeCdiDao;


@SpringBootApplication
public class CdiApplication {
		
	private static Logger LOGGER=LoggerFactory.getLogger(CdiApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext appcontext= SpringApplication.run(CdiApplication.class, args);
		SomeCdiDao cdiDao = appcontext.getBean(SomeCdiDao.class);
		
		
		LOGGER.info("{}", cdiDao);
		
	}
}
