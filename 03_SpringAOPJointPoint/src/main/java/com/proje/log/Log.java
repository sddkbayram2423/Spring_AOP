package com.proje.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	
	@Before("pointCutSevProducts()")
	public void beforeSeve(JoinPoint joinPoint) {
		

		System.out.println("getKind : "+joinPoint.getKind());
		System.out.println("toString : "+joinPoint.toString());
		System.out.println("getTarget : "+joinPoint.getTarget());
		System.out.println("getSignature : "+joinPoint.getSignature());
		System.out.println("---------------------------------------------------------------");
		System.out.println("Urun kaydedilmeye hazirlaniyor");
		
	}
	@After("pointCutSevProducts()")
	public void efterSave(JoinPoint joinPoint) {
		
		
		System.out.println("getKind : "+joinPoint.getKind());
		System.out.println("toString : "+joinPoint.toString());
		System.out.println("getTarget : "+joinPoint.getTarget());
		System.out.println("getSignature : "+joinPoint.getSignature());
		System.out.println("---------------------------------------------------------------");
		System.out.println("Urun kaydedilme bitti");
		
	}
	
	@Pointcut("execution (public void com.proje.productrpoesitoryImp.*.save(*))")
	public void pointCutSevProducts() {
		
	}
	






}
