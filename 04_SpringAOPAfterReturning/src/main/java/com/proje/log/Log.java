package com.proje.log;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.proje.product.Product;
@Aspect
@Component
public class Log {
	
	@AfterReturning(pointcut="execution(public * com.proje.productrpoesitoryImp.ProductRepositoryImp.save(*))", returning="product")
	public void afterReturningAdvice(JoinPoint joinPoint,Product product) {
		
		System.out.println("Ürün eklemeden sonra joinPont: "+joinPoint);
		System.out.println("Eklenen Ürün: "+product);
	}
	
}
