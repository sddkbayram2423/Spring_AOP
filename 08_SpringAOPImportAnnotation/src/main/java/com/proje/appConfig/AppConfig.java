package com.proje.appConfig;

import org.aspectj.lang.annotation.Aspect;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Import;

import com.proje.beans.DataBaseBeans;
import com.proje.beans.DataBaseCongig;
@Aspect
@ComponentScan("com.proje")
@Import({DataBaseBeans.class,DataBaseCongig.class})
public class AppConfig {

}
