package com.proje.productrpoesitoryImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.proje.product.Product;

import com.proje.productrpoesitory.ProductRepository;
@Component("productRepositoryImp")
public class ProductRepositoryImp implements ProductRepository {
	
	private List<Product> products = new ArrayList<Product>();

	@Override
	public void save(Product product) {
		System.out.println(product.getId()+"'idli kaydeildi");
		this.products.add(product);

	}

	@Override
	public void delete(Product product) {
		this.products.remove(product);

	}

	@Override
	public Product findProduct(int i) {
		return this.products.get(i);
	}

	@Override
	public void listProduct() {
		for (Product product : products) {
			System.out.println(product);
		}

	}

}
