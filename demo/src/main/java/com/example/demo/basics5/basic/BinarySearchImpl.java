package com.example.demo.basics5.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	// sort array-> can use different sorting
	// search array
	// return result
	@Autowired
	// @Qualifier("quick")
	private SortAlgo sortAlgo;
	
	private Logger logger=LoggerFactory.getLogger(this.getClass()) ;

	/*
	 * @Autowired public BinarySearchImpl(@Qualifier("quick") SortAlgo sortAlgo) {
	 * super(); this.sortAlgo = sortAlgo; }
	 */

	/*
	 * public void setSortAlgo(SortAlgo sortAlgo) { this.sortAlgo = sortAlgo; }
	 */

	public int binarySearch(int[] numbers, int numberForSearch) {
		int[] sortedNumbers = sortAlgo.sort(numbers);
		for (int i = 0; i <= sortedNumbers.length - 1; i++) {
			if (sortedNumbers[i] == numberForSearch) {
				System.out.println("yes number exits at " + i + " position");
				return i;
			}
		}
		return -1;
		
	}
	
	@PostConstruct
	public void postConst() throws Exception {
	 logger.info("postCOnstruct");
	}

	@PreDestroy
	public void preDes() throws Exception {
		 logger.info("preConstruct");
	}
}
