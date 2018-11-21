package com.lls.ly.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * User: Liyang
 * Date: 2018/11/21
 * Time: 15:12
 */
@Aspect
@Component
public class LogAspect {

    /**
     *
     */
    @Pointcut("execution(* com.lls..*.*(..))")
    public void aspect() {
    }

    /**
     * 配置前置通知,使用在方法aspect()上注册的切入点
     */
    @Before("aspect()")
    public void before(JoinPoint point) {
        String className = point.getTarget().getClass().getName();
        String method = point.getSignature().getName();

        System.out.println("开始调用:" + className + method);
    }

    /**
     * 配置前置通知,使用在方法aspect()上注册的切入点
     */
    @Around("aspect()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String className = proceedingJoinPoint.getTarget().getClass().getName();
        String method = proceedingJoinPoint.getSignature().getName();
        Long startTime = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        Long endTime = System.currentTimeMillis();
        System.out.println(className + "." + method + "方法, 调用耗时:" + (endTime - startTime) + "ms");
        return result;
    }

    /**
     * @param point
     */
    @After("aspect()")
    public void after(JoinPoint point) {
        String className = point.getTarget().getClass().getName();
        String method = point.getSignature().getName();

        System.out.println("结束调用:" + className + method);
    }
}
