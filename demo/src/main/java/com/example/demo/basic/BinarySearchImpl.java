package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	// sort array-> can use different sorting
	// search array
	// return result
	@Autowired
	//@Qualifier("quick")
	private SortAlgo sortAlgo;
	
	
	/*@Autowired
	public BinarySearchImpl(@Qualifier("quick") SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}*/


	/*public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
*/

	public int binarySearch(int[] numbers, int numberForSearch) {
		int[] sortedNumbers = sortAlgo.sort(numbers);
		for (int i = 0; i <= sortedNumbers.length - 1; i++) {
			if (sortedNumbers[i] == numberForSearch) {
				System.out.println("yes number exits at " + i + " position");
				return i;
			}
		}
		return -1
;	}

}
