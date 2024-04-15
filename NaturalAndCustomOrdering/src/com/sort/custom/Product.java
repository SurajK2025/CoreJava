package com.sort.custom;

public class Product {

	private String name;
	private String description;
	private Double price;
	private Integer quantityInStock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	public Product(String name, String description, Double price, Integer quantityInStock) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", quantityInStock="
				+ quantityInStock + "]";
	}
	
}
