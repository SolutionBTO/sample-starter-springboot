package br.com.sample.solutionbto.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Layer of security and audit logs
 * @author solutionbto
 *
 */
@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * execution(* PACKAGE.*.*(args))
	 * 
	 * return {@link JoinPoint}
	 */
	@Before("br.com.sample.solutionbto.aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint){
		logger.info("Check for user access");
		logger.info("Allowed execution for {}", joinPoint);
	}
}
