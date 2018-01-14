package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgo implements SortAlgo{
 public int[] sort(int [] arr) {

	 System.out.println("bubbleSort");
	return arr;
	 
 }
}
