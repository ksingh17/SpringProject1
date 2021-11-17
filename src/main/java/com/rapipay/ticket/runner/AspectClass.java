package com.rapipay.ticket.runner;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
	
	@AfterThrowing(pointcut = "execution(public void com.rapipay.ticket.dao.TicketDao.login(*,*))", throwing = "e")
	public void whenUserUpdate(JoinPoint joinPoint, Exception e) {
		System.out.println(" updation noted :- " + LocalDateTime.now());
		if (e != null) {

//			Object arr[] = joinPoint.getArgs(); // 1
//			for (Object methodArgValue : arr) {
//				System.out.println(" Argument is :- " + methodArgValue); // new Bank Name
//			}
			System.out.println("ERROR !!! Exception Raised " + e);
		}
	}


}
