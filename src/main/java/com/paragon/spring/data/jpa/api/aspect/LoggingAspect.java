package com.paragon.spring.data.jpa.api.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingAspect {
	
	Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	
	@Pointcut(value = "execution(* com.paragon.spring.data.jpa.api.*.*.*(..))")
	public void mypointcut()
	{
		
	}
	
	@Around("mypointcut()")
	public Object applicationLogger(ProceedingJoinPoint pj) throws Throwable
	{
		ObjectMapper mapper=new ObjectMapper();
		String methodName=pj.getSignature().getName();
		String className=pj.getTarget().getClass().toString();
		Object [] arr=pj.getArgs();
		logger.info("method invoked ::" +className +" : "+methodName +"()"+ "arguments : "+mapper.writeValueAsString(arr));
		Object obj=pj.proceed();
		logger.info("method invoked ::" +className +" : "+methodName +"()"+ "Response : "+mapper.writeValueAsString(obj));
		return obj;
	}

}
