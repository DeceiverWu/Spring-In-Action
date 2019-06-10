package com.deceiver.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 15:43
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.deceiver.pojo.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhone() {
        System.out.println("Silencing Cell Phone...");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking Seats...");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("Clap Clap Clap Clap...");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a Refund...");
    }

    @Around("performance()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before around ====");
        try {
            proceedingJoinPoint.proceed();
            System.out.println("after around ===");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
