package br.com.sample.basic.componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(
		value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ComponentJdbcConnection.class);
	
	public ComponentJdbcConnection() {
		LOGGER.info(">>>>>>>>>> "+ComponentJdbcConnection.class.getSimpleName()+" <<<<<<<<<<<");
	}
}
