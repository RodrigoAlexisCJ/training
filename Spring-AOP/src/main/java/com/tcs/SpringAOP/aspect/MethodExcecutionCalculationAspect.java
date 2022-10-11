package com.tcs.SpringAOP.aspect;

//import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExcecutionCalculationAspect {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Around("com.tcs.SpringAOP.aspect.CommonJoinPointConfig.businessLayerExecutionWithing()")
	public void around(ProceedingJoinPoint joinpoint) throws Throwable {
		long timeStarter = System.currentTimeMillis();
		joinpoint.proceed();
		long timeTaken = System.currentTimeMillis()-timeStarter;
		LOGGER.info("Time taken by {} is {}", joinpoint,timeTaken);
	}
}
