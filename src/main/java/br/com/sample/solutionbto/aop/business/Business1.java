package br.com.sample.solutionbto.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sample.solutionbto.aop.aspect.TrackTime;
import br.com.sample.solutionbto.aop.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;
	
	@TrackTime
	public int calculateNextFibonacci(int number){
		return dao1.calculateNextFibonacci(number);
	}
}
