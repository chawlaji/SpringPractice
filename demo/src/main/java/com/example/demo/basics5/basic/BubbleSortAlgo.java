package com.example.demo.basics5.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgo implements SortAlgo{
 public int[] sort(int [] arr) {

	 System.out.println("bubbleSort");
	 int i,j,n;
		
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					n=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=n;
				}
			}
		}
		
	return arr;
	 
 }
}
