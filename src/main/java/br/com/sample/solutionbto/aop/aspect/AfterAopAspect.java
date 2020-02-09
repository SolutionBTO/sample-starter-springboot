package br.com.sample.solutionbto.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Audit logs
 * @author solutionbto
 *
 */
@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * After returning multi scenarios
	 * @param joinPoint
	 */
	@After(value="br.com.sample.solutionbto.aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint){
		logger.info("After execution of {}", joinPoint);
	}
	
	/**
	 * execution(* PACKAGE.*.*(args))
	 * 
	 * @param joinPoint
	 * @param result
	 */
	@AfterReturning(
			value="br.com.sample.solutionbto.aop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning="result"
			)
	public void afterReturning(JoinPoint joinPoint, Object result){
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
	// dont need this
	/*@AfterThrowing(
			value="execution(* br.com.sample.solutionbto.aop.business.*.*(..))",
			throwing="exception"
			)
	public void afterThrowing(JoinPoint joinPoint, Object exception){
		logger.info("{} returned with Throwable {}", joinPoint, exception);
	}*/
}
