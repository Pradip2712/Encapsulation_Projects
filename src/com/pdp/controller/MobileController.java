package com.pdp.controller;

import com.pdp.entity.Product;
import com.pdp.service.MobileService;

public class MobileController {

	public MobileController() {
	}

//	it is parameterized constructor for to give and pass the value
	public MobileController(int capacity) {
		new MobileService(capacity);
	}

//	 create a mehtod of add product
	public static void addProduct(Product[] p) {
		MobileService.createProduct(p);
	}

//		display method
	public static Product[] getAllData() {
		Product[] parr = MobileService.getAllData();
		return parr;
	}

//	 Update product method
	public boolean updateProduct(int id) {
		return MobileService.updateProduct(id);
	}

//	delete product method
	public static void deleteProduct(int id) {
		MobileService.deleteProduct(id);
	}

//	find product by id method
	public static Product findProductById(int id) {
		Product find = MobileService.findProductById(id);
		return find;
	}

}
