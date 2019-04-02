package br.com.sample.solutionbto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SolutionbtoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SolutionbtoApplication.class, args);
		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		int number = 7; 
		System.out.println(
				"Number="+number+" in index="+
				binarySearchImpl.search(new int[]{11,-1,7,3,5,1,0}, number));
	}
}
