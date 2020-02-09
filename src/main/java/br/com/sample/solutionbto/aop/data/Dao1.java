package br.com.sample.solutionbto.aop.data;

import org.springframework.stereotype.Repository;

import br.com.sample.solutionbto.aop.aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public int calculateNextFibonacci(int number){
		int f1 = 0;
		int f2 = 1;
		
		while(f1 <= number) {
			//soma para sequencia
			f2+=f1;
			//calcula diferença para fibonacci
			f1=f2-f1;
		}
		
		return f1;
	}
}
