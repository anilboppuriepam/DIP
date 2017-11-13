package com.epam.dip.maintainable.repository;

import java.util.List;

import com.epam.dip.maintainable.model.Category;
import com.epam.dip.maintainable.model.Product;

public interface IProductContext {

	     public List<Category> getCategories();
	     public List<Product> getProducts();
	     
}
