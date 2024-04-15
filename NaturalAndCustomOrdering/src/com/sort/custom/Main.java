package com.sort.custom;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> productList = ProductHelper.getProductsList();
		
		System.out.println("Orignal List: ");
		for(Product p : productList) {
			System.out.println(p);
		}
		
		Collections.sort(productList, new ProductSortByName());
		
		System.out.println("Sorted List (by Name): ");
		for(Product p : productList) {
			System.out.println(p);
		}
		
		Collections.sort(productList, new ProductSortByStockQty());
		
		System.out.println("Sorted List (by Qunatity in Stock): ");
		for(Product p : productList) {
			System.out.println(p);
		}
	}

}
