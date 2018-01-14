package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());
		
		ApplicationContext Appcontext= SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearch = Appcontext.getBean(BinarySearchImpl.class);
		int result =binarySearch.binarySearch(new int[] {1, 3, 5,13,15} , 13);
	}
}
