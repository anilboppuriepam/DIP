package com.epam.dip.maintainable.model;

import com.epam.dip.maintainable.service.ProductService;

public class Product {

	public Category category;
	public String name;
	public double price;
	public int id;
	public int calories;

	public Product(int id, String name, double price, Category category, int calories) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.calories = calories;
	}

	public Product(ProductService productRepository) {
		// TODO Auto-generated constructor stub
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

}
