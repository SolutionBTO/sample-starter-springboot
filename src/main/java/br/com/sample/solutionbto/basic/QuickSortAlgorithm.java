package br.com.sample.solutionbto.basic;

import static java.util.Arrays.sort;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sorted(int[] numbers){
		sort(numbers);
		return numbers;
	}
	
}