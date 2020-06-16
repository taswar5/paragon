package com.paragon.spring.data.jpa.api.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerForParagon {

	Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	
	@Around("@annotation(com.paragon.spring.data.jpa.api.aspect.LoggerPargon)")
	public void getTimeForLogger(ProceedingJoinPoint pj) throws Throwable
	{
		long l=System.currentTimeMillis();
		String methodName=pj.getSignature().getName();
		String className=pj.getTarget().getClass().toString();
		logger.info("method invoked ::" +className +" : "+methodName +"()"+ "Time taken before at :::::: "+l);
		pj.proceed();	
		long l2=System.currentTimeMillis();
		logger.info("method invoked ::" +className +" : "+methodName +"()"+ "Total Time taken :-- :::::: "+(l2-l));
	}
}
