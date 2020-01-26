package br.com.sample.solutionbto.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	
	@Autowired
	private JdbcConnection jdbcConnection;
		
	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}
	
	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
