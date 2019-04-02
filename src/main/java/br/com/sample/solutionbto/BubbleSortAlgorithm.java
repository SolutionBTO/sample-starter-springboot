package br.com.sample.solutionbto;

import static java.util.Arrays.sort;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int[] sorted(int[] numbers){
		sort(numbers);
		return numbers;
	}
	
}
