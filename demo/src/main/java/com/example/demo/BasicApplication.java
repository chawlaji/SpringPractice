package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.basics5.basic.BinarySearchImpl;



@SpringBootApplication
public class BasicApplication implements CommandLineRunner{
	@Autowired 
	BinarySearchImpl binarySearch;

	public static void main(String[] args) {
		
		SpringApplication.run(BasicApplication.class, args);
		 //without
		//ApplicationContext Appcontext= SpringApplication.run(BasicApplication.class, args);
		//BinarySearchImpl binarySearch = Appcontext.getBean(BinarySearchImpl.class);
		//int result =binarySearch.binarySearch(new int[] {5, 33, 6,17,15} , 13);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int result =binarySearch.binarySearch(new int[] {5, 33, 6,17,15} , 6);
		
	}
}
