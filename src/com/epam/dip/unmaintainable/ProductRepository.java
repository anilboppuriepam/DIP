package com.epam.dip.unmaintainable;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

	private ProductContext dbContext;
	
	public ProductRepository() {
	dbContext = new ProductContext();
	}
	
	public List<Product> getAllProducts(){
		
		List<Product> products = new ArrayList<>();
		 products = dbContext.getProducts();
		 return products ;
	}
}
