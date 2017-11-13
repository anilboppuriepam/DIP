package com.epam.dip.maintainable.repository;

import java.util.List;

import com.epam.dip.maintainable.model.Product;

public class ProductRepository implements IProductRepository {

	private IProductContext  dbContext;
	
	public ProductRepository(IProductContext dbContext) {
 this.dbContext = dbContext;
	}
	
	public List<Product> getAllProducts(){
		
		return dbContext.getProducts();
	}
	
}
