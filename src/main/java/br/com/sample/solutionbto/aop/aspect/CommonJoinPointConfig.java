package br.com.sample.solutionbto.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * orquestration by aspect aop
 * @author solutionbto
 *
 */
public class CommonJoinPointConfig {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Pointcut("execution(* br.com.sample.solutionbto.aop.data.*.*(..))")
	public void dataLayerExecution(){
		
	}
	
	@Pointcut("execution(* br.com.sample.solutionbto.aop.business.*.*(..))")
	public void businessLayerExecution(){
		
	}
	
	@Pointcut("br.com.sample.solutionbto.aop.aspect.CommonJoinPointConfig.dataLayerExecution() && br.com.sample.solutionbto.aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution(){
		
	}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){
		
	}
	
	@Pointcut("within(br.com.sample.solutionbto.aop.data..*)")
	public void dataLayerExecutionWithWithin(){
		
	}
	
	@Pointcut("@annotation(br.com.sample.solutionbto.aop.aspect.TrackTime)")
	public void trackTimeAnnotation(){
		logger.info("trackTimeAnnotation()");
	}
	
	
	
}
