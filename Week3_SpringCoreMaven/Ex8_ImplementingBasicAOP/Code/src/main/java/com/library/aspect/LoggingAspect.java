package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LoggingAspect: Method " + joinPoint.getSignature().getName() + " started.");
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("LoggingAspect: Method " + joinPoint.getSignature().getName() +
                           " finished. Time taken: " + (end - start) + "ms");
        return result;
    }
}
