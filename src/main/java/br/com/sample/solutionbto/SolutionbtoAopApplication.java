package br.com.sample.solutionbto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.sample.solutionbto.aop.business.Business1;

/**
 * https://github.com/in28minutes/spring-master-class/blob/master/03-spring-aop/Step03.md
 * @author solutionbto
 *
 */
@SpringBootApplication
public class SolutionbtoAopApplication implements CommandLineRunner{
	
	private static Logger LOGGER = LoggerFactory.getLogger(SolutionbtoAopApplication.class);
	
	@Autowired
	Business1 business1;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SolutionbtoAopApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		int value1 = business1.calculateNextFibonacci(8);
		LOGGER.info("Enter value is {} -> {}",8, value1);
	}
}
