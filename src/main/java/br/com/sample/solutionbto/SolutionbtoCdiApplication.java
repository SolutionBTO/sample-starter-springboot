package br.com.sample.solutionbto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.sample.solutionbto.basic.cdi.SomeCdiBusiness;

/**
 * Spring implement CDI , not diference in choice
 * @author solutionbto
 *
 */
@SpringBootApplication
public class SolutionbtoCdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SolutionbtoCdiApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SolutionbtoCdiApplication.class, args);
		
		SomeCdiBusiness someCdiBusiness = context.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{}", someCdiBusiness.toString());
		LOGGER.info("{}", someCdiBusiness.getSomeCdiDAO().toString());
		LOGGER.info("someCdiBusiness.findGreatestByData() ->"+someCdiBusiness.findGreatestByData());
	}
}
