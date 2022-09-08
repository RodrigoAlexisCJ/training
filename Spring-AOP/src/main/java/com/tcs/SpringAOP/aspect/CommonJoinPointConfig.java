package com.tcs.SpringAOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.tcs.SpringAOP.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.tcs.SpringAOP.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("com.tcs.SpringAOP.aspect.CommonJoinPointConfig.businessLayerExecution() && com.tcs.SpringAOP.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void allLayerExecution() {}
	
	@Pointcut("bean(*dao*)")
	public void beanLaterExecution() {} 
	
	@Pointcut("within(com.tcs.SpringAOP.business..*)")
	public void businessLayerExecutionWithing() {}
}
