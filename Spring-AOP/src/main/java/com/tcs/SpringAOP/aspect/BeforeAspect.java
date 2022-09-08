package com.tcs.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//@Before("execution(* com.tcs.SpringAOP.business.*.*(..))")
	/*@Before("execution(* com.tcs.SpringAOP. .*.*(..))")
	public void before(JoinPoint joinpoint) {
		LOGGER.info(" Intercep Method Call - {}", joinpoint);
	}*/
	
	@AfterReturning( value="execution(* com.tcs.SpringAOP.business.*.*(..))",
					returning = "result" )
	public void afterReturn(JoinPoint joinpoint,Object result) {
		LOGGER.info("{} return {}", joinpoint,result);
	}
	@After("execution(* com.tcs.SpringAOP.business.*.*(..))")
	public void after(JoinPoint joinpoint) {
		LOGGER.info("After execution of {}", joinpoint);
	}
}
