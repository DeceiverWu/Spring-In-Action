package com.deceiver.pojo;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 15:43
 */
public class Audience {

    public void silenceCellPhone() {
        System.out.println("Silencing Cell Phone...");
    }

    public void takeSeats() {
        System.out.println("Taking Seats...");
    }

    public void applause() {
        System.out.println("Clap Clap Clap Clap...");
    }

    public void demandRefund() {
        System.out.println("Demanding a Refund...");
    }

    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("Silencing Cell Phone...");
            System.out.println("Taking Seats...");

            proceedingJoinPoint.proceed();

            System.out.println("Clap Clap Clap Clap...");
        } catch (Throwable a) {
            System.out.println("Demanding a Refund...");
        }

    }
}
