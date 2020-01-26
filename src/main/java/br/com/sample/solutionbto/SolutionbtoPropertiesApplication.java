package br.com.sample.solutionbto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import br.com.sample.solutionbto.basic.SomeExternalService;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SolutionbtoPropertiesApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SolutionbtoPropertiesApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SolutionbtoPropertiesApplication.class, args);
		
		SomeExternalService someExternalService = context.getBean(SomeExternalService.class);
		
		LOGGER.info(String.format("%s\t%s", someExternalService.toString() , someExternalService.returnServiceUrl()));
	}
}
