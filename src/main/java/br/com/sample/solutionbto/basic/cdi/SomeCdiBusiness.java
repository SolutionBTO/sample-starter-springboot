package br.com.sample.solutionbto.basic.cdi;

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
}
