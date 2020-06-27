package com.proje.product;

public class Product {
	
	private int id;
	private String name;
	private String category;
	private int avaible;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String category, int avaible) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.avaible = avaible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getAvaible() {
		return avaible;
	}

	public void setAvaible(int avaible) {
		this.avaible = avaible;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", avaible=" + avaible + "]";
	}
	
}
