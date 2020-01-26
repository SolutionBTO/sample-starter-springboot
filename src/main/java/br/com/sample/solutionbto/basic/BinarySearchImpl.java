package br.com.sample.solutionbto.basic;

import static java.util.Arrays.binarySearch;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * business
 * @author solutionbto
 *
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl{
	
	private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
	//@Qualifier("bubble")
	private SortAlgorithm quickSortAlgorithm;
		
	public BinarySearchImpl(SortAlgorithm quickSortAlgorithm) {
		super();
		this.quickSortAlgorithm = quickSortAlgorithm;
	}
	
	public int search(int[] numbers, int numberTo){
		numbers = quickSortAlgorithm.sorted(numbers);
		LOGGER.info(this.quickSortAlgorithm.getClass().getSimpleName());
		LOGGER.info(Arrays.toString(numbers));
		return binarySearch(numbers, numberTo);
	}
	
	@PostConstruct
	public void postConstruct(){
		LOGGER.info(">>>> POST CONSTRUCT <<<<");
	}
	
	@PreDestroy
	public void preDestroy(){
		LOGGER.info(">>>> PRE DESTROY <<<<");
	}
}


