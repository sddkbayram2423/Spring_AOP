package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.proje.appConfig.AppConfig;
import com.proje.product.Product;
import com.proje.productrpoesitory.ProductRepository;


public class TestConfig {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductRepository productRepository=applicationContext.getBean(ProductRepository.class);
		
		
		Product product=new Product(1, "telefon", "aklli", 5);
		Product product1=new Product(2, "araba", "2nci el", 5);
		Product product2=new Product(3, "telefon", "tuslu", 5);
		
		productRepository.save(product);
		productRepository.save(product1);
		productRepository.save(product2);
		
		
		applicationContext.close();

	}

}
