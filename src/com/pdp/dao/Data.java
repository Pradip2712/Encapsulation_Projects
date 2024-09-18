package com.pdp.dao;

import java.util.Scanner;

import com.pdp.entity.Product;

public class Data {

	public static Product[] parr;
	public static int size;
	private static int capacity;

	static Scanner sc = new Scanner(System.in);

	public Data() {
		// TODO Auto-generated constructor stub
	}

	// it is Parameterized constructor for passing the capacity of array
	public Data(int capacity) {
		this.capacity = capacity;
		parr = new Product[capacity];
		size = 0;
	}

	// it is add method for adding the data into array
	public static void addMobile(Product[] p) {
		for (Product product : p) {

			if (size < capacity) {
				parr[size++] = product;
			} else {
				System.out.println("array limit full");
			}
		}
	}

	// it is display getAllData() for display all the product
	public static Product[] getAllData() {
		return parr;
	}

	// it is updatedData() for update some data
	public static boolean updateData(int id) {

		for (int i = 0; i < size; i++) {
			if (parr[i].getId() == id) {
				System.out.println("ID is matched... ");

				System.out.print("enter your new id : ");
				int nid = sc.nextInt();
				System.out.print("Enter new product name : ");
				String name = sc.next();
				System.out.print("Enter new product price : ");
				double price = sc.nextDouble();

//				Product updatedProduct = new Product(nid, name, price);

				parr[i].setId(nid);
				parr[i].setCname(name);
				parr[i].setPrice(price);

				System.out.println("updated succesfully...");
				return true;
			} else {
				System.out.println("ID is not found : ");
			}
		}

		return false;
	}

	// it is delete method for delete some product
	public static void deleteProduct(int id) {
		for (int i = 0; i < size; i++) {

			if (parr[i].getId() == id) {

				parr[i] = parr[size - 1];
				parr[size - 1] = null;
				size--;
				System.out.println("Deleted Succesfully...");
			} else {
				System.out.println("ID is not found");
			}
		}
	}

//		it is findProductById method for finding the data by using id	
	public static Product findProducyById(int id) {

		for (int i = 0; i < size; i++) {
			if (parr[i].getId() == id) {
				System.out.println("find succsfullly..");

				return parr[i];
			} else {
				System.out.println("Product no found : ");
			}
		}
		return null;
	}

}
