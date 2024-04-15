package com.sort.custom;

import java.util.Comparator;

public class ProductSortByStockQty implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getQuantityInStock().compareTo(o2.getQuantityInStock());
	}
	
}
