package com.zayyni.aopapp.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspectV2 {

    @Before("allServiceMethodsPointCut()")
    public void beforeServiceMethodCalls(JoinPoint joinPoint) {
        log.info("Before Advice method calls, signature {}", joinPoint.getSignature());
    }


//    @After("allServiceMethodsPointCut()")
    @AfterReturning(value = "allServiceMethodsPointCut()",returning = "returnedObj")
    public void afterServiceMethodCalls(JoinPoint joinPoint, Object returnedObj) {
        log.info("After returning Advice method calls, signature {}", joinPoint.getSignature());
        log.info("After returning return value, returnedObj {}", returnedObj);
    }


    @AfterThrowing(value = "allServiceMethodsPointCut()")
    public void afterServiceMethodCallThrows(JoinPoint joinPoint) {
        log.info("After throwing Advice method calls, signature {}", joinPoint.getSignature());

    }

    @Around("allServiceMethodsPointCut()")
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Long startTime = System.currentTimeMillis();
        Object returnedValue = proceedingJoinPoint.proceed();
        Long endTime = System.currentTimeMillis();

        Long executionTime = endTime - startTime;
        log.info("Execution time: {} ms", executionTime);
        return returnedValue;
    }


    @Pointcut("execution(* com.zayyni.aopapp.services.impl.*.*(..))")
    public void allServiceMethodsPointCut() {}






}


