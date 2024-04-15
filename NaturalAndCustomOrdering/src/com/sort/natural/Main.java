package com.sort.natural;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> productList = ProductHelper.getProductsList();
		
		System.out.println("Orignal List: ");
		for(Product p : productList) {
			System.out.println(p);
		}
		
		Collections.sort(productList);
		
		System.out.println("Sorted List: ");
		for(Product p : productList) {
			System.out.println(p);
		}
	}
}