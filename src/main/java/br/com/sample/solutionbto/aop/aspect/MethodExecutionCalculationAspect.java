package br.com.sample.solutionbto.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//https://www.baeldung.com/spring-aop-annotation#logging-our-execution-time
	@Around("br.com.sample.solutionbto.aop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
		long start = System.currentTimeMillis();
		 
	    Object proceed = joinPoint.proceed();
	 
	    long executionTime = System.currentTimeMillis() - start;
	    
	    logger.info(joinPoint.getSignature() + " executed in " + executionTime + "ms");
	    
	    return proceed;
	}
}
