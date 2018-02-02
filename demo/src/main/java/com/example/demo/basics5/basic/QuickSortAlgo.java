package com.example.demo.basics5.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo {

	

	public int[] sort(int [] arr) {
		
		 System.out.println("quicksort");
		return quickSort(arr,0,arr.length-1);
	}
	
	 
	 
	 int[] quickSort(int arr[],int start,int end)
		{
			if(start<end)
			{
				int pIndex= partition(arr,start,end);
				quickSort(arr,start,pIndex-1);
				quickSort(arr,pIndex+1,end);
			}
			return arr;
		}
		
		int partition(int arr[],int start,int end)
		{
			int swap;
			int pivot=arr[end];
			int pIndex=start;
			
			for(int i=start;i<=end-1;i++)
			{
				if(arr[i]<=pivot)
				{
					swap=arr[i];
					arr[i]=arr[pIndex];
					arr[pIndex]=swap;
					pIndex=pIndex+1;
				}
			}
			
			swap=arr[end];
			arr[end]=arr[pIndex];
			arr[pIndex]=swap;
		
			return pIndex;
		}

}


