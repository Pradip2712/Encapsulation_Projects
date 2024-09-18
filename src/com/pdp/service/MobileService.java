package com.pdp.service;

import com.pdp.dao.Data;
import com.pdp.entity.Product;

public class MobileService {

	static Data d = new Data();

	public MobileService() {
		// TODO Auto-generated constructor stub
	}

//	it is parameterized constructor for to give and pass the value
	public MobileService(int capacity) {
		new Data(capacity);
	}

	// Adding method
	public static void createProduct(Product[] p) {
		Data.addMobile(p);
	}

	// display method
	public static Product[] getAllData() {
		Product[] parr = Data.getAllData();
		return parr;
	}

	// update mehtod
	public static boolean updateProduct(int id) {
		return Data.updateData(id);
	}

//	delete method
	public static void deleteProduct(int id) {
		Data.deleteProduct(id);
	}

//	find product by id method
	public static Product findProductById(int id) {
		Product find = Data.findProducyById(id);
		return find;
	}

}
