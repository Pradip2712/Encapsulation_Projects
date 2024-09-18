package com.pdp.entity;

public class Product {

	private int id;
	private String cname;
	private double price;

	public Product() {
		super();
	}

	public Product(int id, String cname, double price) {
		super();
		this.id = id;
		this.cname = cname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", cname=" + cname + ", price=" + price + "]";
	}

}
