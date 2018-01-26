package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.basics5.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.example.demo.basics5.basic")
public class BasicApplicationWotSpringBoot {

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());

		try (AnnotationConfigApplicationContext Appcontext = new AnnotationConfigApplicationContext(
				BasicApplicationWotSpringBoot.class)) {
			BinarySearchImpl binarySearch = Appcontext.getBean(BinarySearchImpl.class);
			binarySearch.binarySearch(new int[] { 1, 3, 5, 13, 15 }, 13);
		}
		// Appcontext.close(); or put the context using code in try () {code} it will close the AppContext and exit. 
		//implement AutoClossable interace
	}
}
