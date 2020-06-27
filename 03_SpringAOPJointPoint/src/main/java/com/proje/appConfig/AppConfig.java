package com.proje.appConfig;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Aspect
@ComponentScan("com.proje")
@EnableAspectJAutoProxy
public class AppConfig {

}
