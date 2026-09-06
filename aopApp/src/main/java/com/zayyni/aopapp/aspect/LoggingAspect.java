package com.zayyni.aopapp.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

//    @Before("execution(* com.zayyni.aopapp.services.impl.ShipmentServiceImpl.*(..))")
//    public void beforeShipmentServiceMethods(JoinPoint joinPoint) {
//        log.info("Before method call: {} ",joinPoint.getSignature().getName());
//    }


//    @Before("execution(* orderPackage(..))")
//    @Before("execution(* com.zayyni.aopapp.services.impl.*.orderPackage(..))")
    @Before("execution(* com.zayyni.aopapp.services.impl.*.*(..))")
    public void beforeOrderPackage(JoinPoint joinPoint) {
        log.info("Before called from logging Aspect kind, {}", joinPoint.getSignature());
        log.info("Before called with parameters signature, {}", joinPoint.getKind());
    }


//    @Before("within(com.zayyni.aopapp.services.impl.*)")
    @Before("within(com.zayyni.aopapp..*)")
    public void beforeServiceImplCalls(JoinPoint joinPoint) {
        log.info("Service Impl calls, signature {}", joinPoint.getSignature());
    }

    @After("myLoggingAndAopMethodsPointCut()")
    public void afterTransactionalAnnotation(JoinPoint joinPoint) {
        log.info("After MyLogging annotation calls, signature {}", joinPoint.getSignature());
    }



//    @Before("@annotation(org.springframework.transaction.annotation.Transactional)")
    @Before("myLoggingAndAopMethodsPointCut()")
    public void beforeTransactionalAnnotation(JoinPoint joinPoint) {
        log.info("Before MyLogging annotation calls, signature {}", joinPoint.getSignature());
    }


    @Pointcut("@annotation(com.zayyni.aopapp.aspect.MyLogging) && within(com.zayyni.aopapp..*)")
    public void myLoggingAndAopMethodsPointCut() {

    }


}
