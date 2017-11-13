package com.epam.dip.maintainable.client;

import java.util.List;

import com.epam.dip.maintainable.model.Product;
import com.epam.dip.maintainable.repository.IProductContext;
import com.epam.dip.maintainable.repository.IProductRepository;
import com.epam.dip.maintainable.repository.ProductContext;
import com.epam.dip.maintainable.repository.ProductRepository;
import com.epam.dip.maintainable.service.ProductService;


public class Client {

	public static void main(String[] args) {
	
		 IProductContext productContext = new ProductContext();
		 IProductRepository productRepository = new ProductRepository(productContext);
		ProductService productService = new ProductService(productRepository);
		List<Product> products = productService.getAllProducts();  
		System.out.println("Number of products in store " + products.size());
	

	for(Product product : products){
		
		       System.out.printf("Meal %s, Name: %d, Rs.%d, Calories: %d",product.category.name, product.name,product.price,product.calories);
	}
}
}