package com.proje.log;

import org.aspectj.lang.annotation.After;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	@Before("execution (public void com.proje.productrpoesitoryImp.ProductRepositoryImp.save(*))")
		public void beforeSave() {
		System.out.println("�r�n kaydedilmey haz�rlan�yor");
	}
	@After("execution (public void com.proje.productrpoesitoryImp.ProductRepositoryImp.save(*))")
//	@Before("execution (public * com.proje.productrpoesitoryImp.*.delete(*))")
	public void afterSave() {
		System.out.println("�r�n kaydedilme bitti");
	}

}
