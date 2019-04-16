package br.com.sample.solutionbto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.sample.solutionbto.basic.BinarySearchImpl;

@SpringBootApplication
public class SolutionbtoBasicApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SolutionbtoBasicApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SolutionbtoBasicApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		
		int number = 7; 
		int result= binarySearchImpl.search(new int[]{11,-1,7,3,5,1,0}, number);
		LOGGER.info(String.format("%s%s%s%s","Number=",number," in index=",result));
	}
}
