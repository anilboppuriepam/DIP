package com.epam.dip.maintainable.service;

import java.util.ArrayList;
import java.util.List;

import com.epam.dip.maintainable.model.Product;
import com.epam.dip.maintainable.repository.IProductRepository;

public class ProductService {

	private IProductRepository productRepository;
	
	public ProductService(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> getAllProducts(){
		
		List <Product> products = new ArrayList<>();
		 products = productRepository.getAllProducts();
		 return products ;
	}
}
