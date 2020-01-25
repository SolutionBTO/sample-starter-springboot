package br.com.sample.solutionbto.basic;

import static java.util.Arrays.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int[] sorted(int[] numbers){
		sort(numbers);
		return numbers;
	}
	
}
