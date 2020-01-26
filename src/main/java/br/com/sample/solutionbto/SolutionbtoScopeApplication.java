package br.com.sample.solutionbto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.sample.solutionbto.scope.PersonDAO;

@SpringBootApplication
public class SolutionbtoScopeApplication {
	
private static Logger LOGGER = LoggerFactory.getLogger(SolutionbtoScopeApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SolutionbtoScopeApplication.class, args);
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		LOGGER.info(personDAO.toString());
		LOGGER.info(personDAO.getJdbcConnection().toString());
		LOGGER.info(personDAO.getJdbcConnection().toString());
		LOGGER.info(personDAO.getJdbcConnection().toString());
		LOGGER.info(personDAO.getJdbcConnection().toString());
		
	}
}
