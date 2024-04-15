package com.sort.custom;

import java.util.ArrayList;
import java.util.List;

public class ProductHelper {
	
	public static List<Product> getProductsList() {
		List<Product> productsList = new ArrayList<Product>();
		
		productsList.add(new Product("Monitor", "15 inch samsung monitor", 6000.00, 8));
		productsList.add(new Product("CPU", "Dell standard CPU", 15000.00, 5));
		productsList.add(new Product("Keyboard", "Dell full size keyboard", 1000.00, 10));
		
		return productsList;
	}
}
