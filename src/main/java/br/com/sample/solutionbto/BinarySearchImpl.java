package br.com.sample.solutionbto;

import static java.util.Arrays.binarySearch;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{
	
	@Autowired
	private SortAlgorithm quickSortAlgorithm;
		
	public BinarySearchImpl(SortAlgorithm quickSortAlgorithm) {
		super();
		this.quickSortAlgorithm = quickSortAlgorithm;
		System.out.println(this.quickSortAlgorithm);
	}
	
	public int search(int[] numbers, int numberTo){
		numbers = quickSortAlgorithm.sorted(numbers);
		System.out.println(Arrays.toString(numbers));
		return binarySearch(numbers, numberTo);
	}
}


