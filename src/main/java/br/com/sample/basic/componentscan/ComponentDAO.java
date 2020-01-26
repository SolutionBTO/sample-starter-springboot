package br.com.sample.basic.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {
	
	@Autowired
	private ComponentJdbcConnection componentJdbcConnection;
		
	public ComponentJdbcConnection getComponentJdbcConnection() {
		return componentJdbcConnection;
	}
	
	public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}
}
