package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.example.demo.basics5.properties.SomeExternalService;




@ConfigurationProperties("classpath:app.yml")
//@PropertySource("classpath:application.properties")
public class PropertiesApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceURL());
		
	}
}