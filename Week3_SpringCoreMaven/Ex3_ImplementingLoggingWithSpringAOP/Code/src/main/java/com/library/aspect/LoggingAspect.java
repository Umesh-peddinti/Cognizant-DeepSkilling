package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("[LOG] --> Starting method: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("[LOG] --> Finished method: " + joinPoint.getSignature().getName() + " in " + timeTaken + " ms");
        return result;
    }
}