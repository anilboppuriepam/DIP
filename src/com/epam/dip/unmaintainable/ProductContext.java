package com.epam.dip.unmaintainable;

import java.util.ArrayList;
import java.util.List;

public class ProductContext {

	private List<Product> products;
	private List<Category> categories;
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public ProductContext(){
		
		categories  =new ArrayList<>();
		
		Category   morningMeals  = new  Category (1, "Breakfast");
         Category  afternoonMeals = new  Category( 2,"Lunch" );
           Category eveningMeals =  new  Category( 3,  "Dinner");
          
          categories.add(morningMeals);
          categories.add(afternoonMeals);
          categories.add(eveningMeals);
          
          products =  new ArrayList<>();
          
          products.add(new Product (1, "li", 30, morningMeals,400));
          products.add(new Product ( 2, "Bread Omlet",25, morningMeals,  500));
          products.add(new Product ( 3, "Dosa", 35,morningMeals,600));

          products.add(new Product (4, "Chicken",  90,  afternoonMeals, 800));
          products.add(new Product ( 5,  "Pure Veg", 75, afternoonMeals, 700 ));
          products.add(new Product ( 6,   "Tuna Meals", 150, afternoonMeals, 900 ));

          products.add(new Product (7,   "Boneless Chicken",   100,   eveningMeals, 500));
          products.add(new Product (8,   "Pure veg with roti",   25,   eveningMeals, 450));
          products.add(new Product ( 9,   "Evening Dosa",   35,   eveningMeals,550));
		
	}
}
