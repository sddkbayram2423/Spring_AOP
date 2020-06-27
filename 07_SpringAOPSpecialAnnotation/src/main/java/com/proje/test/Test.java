package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.product.Product;
import com.proje.productrpoesitory.ProductRepository;
import com.proje.productrpoesitoryImp.ProductRepositoryImp;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductRepository productRepository=applicationContext.getBean("productRepositoryImp",ProductRepositoryImp.class);
		
		
		Product product=new Product(1, "telefon", "aklliý", 5);
		Product product1=new Product(2, "araba", "2nci el", 5);
		Product product2=new Product(3, "telefon", "tuslu", 5);
		
		productRepository.save(product);
		productRepository.save(product2);
		productRepository.save(product1);
		
		
		
		applicationContext.close();
		

	}

}
