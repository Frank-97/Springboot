package com.frank.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Package: com.frank.springboot.aop
 * @ClassName: MyAspact
 * @Author Frank
 * @Data 2022-03-30-18:15
 * @Description:
 */
@Aspect
@Component
public class MyAspact {

    @Pointcut("execution (* com.frank.springboot.aop.AopTest.test())")
    public void LogAspect(){}

    @Before("LogAspect()")
    public void before(JoinPoint joinPoint){
        System.out.println("MyAspect.before");
    }

}
