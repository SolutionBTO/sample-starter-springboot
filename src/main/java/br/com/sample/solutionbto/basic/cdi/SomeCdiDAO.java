package br.com.sample.solutionbto.basic.cdi;

import javax.inject.*;

@Named
public class SomeCdiDAO {
	
	public SomeCdiDAO() {}
	
	public Integer[] getData(){
		Integer [] numbers=new Integer[]{33, 9,8,3,1,4,5,22,33,44,55};
		return numbers;
	}
}
