package com.proje.log;

import org.aspectj.lang.ProceedingJoinPoint;


import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;


@Aspect
@Component
public class Log {
	
	@Around("@annotation(com.proje.logannatotaion.LogAnnatotaion)")
	public void aroundAdvice(ProceedingJoinPoint joinPoint) {
		
		try {
			
			System.out.println("Around basladi");
			joinPoint.proceed();
			
			System.out.println("Around bitti");
			
		} catch (Throwable e) {
			System.out.println("Hata tespit edildi "+e);
		
		}
		
		
		
	}

	
}
