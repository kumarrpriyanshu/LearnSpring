package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect

public class LoggingAspect {
	
	public void log() {
		System.out.println("aspect log called");
	}

}
