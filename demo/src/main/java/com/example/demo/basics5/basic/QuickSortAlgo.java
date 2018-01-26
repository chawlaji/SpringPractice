package com.example.demo.basics5.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo {

	

	public int[] sort(int [] inputArr) {
		 System.out.println("quicksort");
		return inputArr;
}
}
