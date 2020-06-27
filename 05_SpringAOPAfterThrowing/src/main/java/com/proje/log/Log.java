package com.proje.log;

import org.aspectj.lang.JoinPoint;



import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Log {
	
	@AfterThrowing(pointcut="execution(public * com.proje.productrpoesitoryImp.ProductRepositoryImp.save(*))", throwing="exception")
	public void afterReturningAdvice(JoinPoint joinPoint,RuntimeException exception) {
		
		System.out.println("Urun eklemeden sonra joinPont: "+joinPoint);
		System.out.println("Eklenen Urun sonra olusan hata: "+exception);
	}
	
}
