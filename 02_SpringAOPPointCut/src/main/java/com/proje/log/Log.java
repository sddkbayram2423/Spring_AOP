package com.proje.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	

	@Before("pointCutRepository3()")
	public void beforeSave() {
		System.out.println("Urun kaydedilmeye hazirlaniyor");
	}

	
	@After("pointCutRepository3()")
	public void afterSave() {
		System.out.println("Urun kaydedilme bitti");
	}
	
	

	@Pointcut("within (com.proje.productrpoesitoryImp.*)")
	public void pointCutRepository3() {}
	

}
