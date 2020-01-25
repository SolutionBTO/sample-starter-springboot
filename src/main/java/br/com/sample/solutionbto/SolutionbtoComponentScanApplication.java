package br.com.sample.solutionbto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import br.com.sample.basic.componentscan.ComponentDAO;


@SpringBootApplication
@ComponentScan("br.com.sample.basic.componentscan")
public class SolutionbtoComponentScanApplication {
	
private static Logger LOGGER = LoggerFactory.getLogger(SolutionbtoComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SolutionbtoComponentScanApplication.class, args);
		
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		
		LOGGER.info(componentDAO.toString());
		LOGGER.info(componentDAO.getComponentJdbcConnection().toString());
		LOGGER.info(componentDAO.getComponentJdbcConnection().toString());
		
	}
}
