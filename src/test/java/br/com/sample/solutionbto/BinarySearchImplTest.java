package br.com.sample.solutionbto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sample.solutionbto.basic.BinarySearchImpl;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SolutionbtoBasicApplication.class)
public class BinarySearchImplTest {
	
	@Autowired
	private BinarySearchImpl binarySearchImpl;
	
	@Test
	public void binarySearchTest(){
		int result = this.binarySearchImpl.search(
				      //-5 -1 0 1 3 4
				new int[]{-5,4,1,-1,0,3}, 3);
		assertEquals(result, 4);
	}

}
