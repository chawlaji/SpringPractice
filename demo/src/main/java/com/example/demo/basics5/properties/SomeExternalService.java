package com.example.demo.basics5.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	
	@Value("${external.serviceurl}")
	private String url;
	
	public String returnServiceURL(){
		return url;
	}

}
