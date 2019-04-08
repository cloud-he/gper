package com.gupaoedu.cloud.pattern.summary.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Mtime on 2019/4/7 0007.
 */
@Aspect
@Component
public class PersonAop {

    @Pointcut("execution(public * com.gupaoedu.cloud.pattern.summary.aop.Person.doSomething())")
    public void point(){}

    @Before("point()")
    public void beforeMethod(){
        System.out.println("前置增强");
    }

    @After("point()")
    public void afterMethod(){
        System.out.println("后置增强");
    }

    @Around("point()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕增强-前置");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("环绕增强-后置");
        return object;
    }

    @AfterThrowing("point()")
    public void throwingMethod(){
        System.out.println("抛出异常");
    }

}
