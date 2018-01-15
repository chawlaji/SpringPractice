package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.basic.BinarySearchImpl;

@SpringBootApplication
public class ScopeApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());
		
		ApplicationContext Appcontext1= SpringApplication.run(ScopeApplication.class, args);
		ApplicationContext Appcontext2= SpringApplication.run(ScopeApplication.class, args);
		System.out.println(Appcontext1);
		System.out.println(Appcontext2);
		BinarySearchImpl binarySearch = Appcontext1.getBean(BinarySearchImpl.class);
		int result =binarySearch.binarySearch(new int[] {1, 3, 5,13,15} , 13);
	}
}
