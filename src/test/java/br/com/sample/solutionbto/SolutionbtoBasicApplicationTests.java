package br.com.sample.solutionbto;

import static java.util.Arrays.sort;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.sample.solutionbto.basic.BinarySearchImpl;
import br.com.sample.solutionbto.basic.SortAlgorithm;


@RunWith(MockitoJUnitRunner.class)
public class SolutionbtoBasicApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(SolutionbtoBasicApplicationTests.class);
	
	@Mock
	private SortAlgorithm quickSortAlgorithm;
	
	@InjectMocks
	BinarySearchImpl binarySearchImpl; 
	
	@BeforeClass
	public static void beforeClass(){
		logger.info(">>>> BEFORE CLASS STATIC <<<<");
	}
	
	@Before
	public void before(){
		logger.info(">>>> BEFORE <<<<");
	}
	
	@Test
	public void binarySearchTest() {
		int[] numbers = new int[]{5,2,3,1,4,-1};
		sort(numbers);
		
		when(quickSortAlgorithm
					.sorted(Mockito.any()))
					.thenReturn(numbers);
		
		assertEquals(binarySearchImpl
							.search(Mockito.any(), 5),5);
	}
	
	@After
	public void after(){
		logger.info(">>>> AFTER <<<<");
	}
	
	@AfterClass
	public static void afterClass(){
		logger.info(">>>> AFTER CLASS STATIC <<<<");
	}

}
