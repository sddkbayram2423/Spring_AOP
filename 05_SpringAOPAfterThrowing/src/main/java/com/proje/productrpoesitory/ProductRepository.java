package com.proje.productrpoesitory;

import com.proje.product.Product;

public interface ProductRepository {

	public Product save(Product product) throws Exception;

	public void delete(Product product);

	public Product findProduct(int i);

	public void listProduct();

}
