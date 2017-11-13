package com.epam.dip.maintainable.repository;

import java.util.List;

import com.epam.dip.maintainable.model.Product;

public interface IProductRepository {
 
	 List<Product> getAllProducts();
}
