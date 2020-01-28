package br.com.sample.solutionbto.basic.cdi;

import java.util.Comparator;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCdiDAO() {
		return someCdiDAO;
	}

	public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
		this.someCdiDAO = someCdiDAO;
	}
	
	public int findGreatestByData(){
		Integer [] numbers = this.someCdiDAO.getData();
		
		if(numbers == null || numbers.length == 0)
			return Integer.MIN_VALUE;
		
		return Stream
				.of(numbers)
				.max(Comparator.comparing(Integer::valueOf))
				.get();
	}
}
