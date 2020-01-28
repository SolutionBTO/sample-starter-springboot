package br.com.sample.solutionbto;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.sample.solutionbto.basic.cdi.SomeCdiBusiness;
import br.com.sample.solutionbto.basic.cdi.SomeCdiDAO;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@InjectMocks
	private SomeCdiBusiness someCdiBusiness;
	
	@Mock
	private SomeCdiDAO someCdiDAO;
	
	@Test
	public void findGreatestByDataTest() {
		when(someCdiDAO.getData()).thenReturn(new Integer[]{0,44,33,2,1});
		int result = this.someCdiBusiness.findGreatestByData();
		assertEquals(result , 44);
	}
	
	@Test
	public void findGreatestByDataTestEmpty() {
		when(someCdiDAO.getData()).thenReturn(new Integer[]{});
		int result = this.someCdiBusiness.findGreatestByData();
		Assert.assertTrue(result == Integer.MIN_VALUE);
	}
}
