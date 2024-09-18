package com.pdp.client;

import java.util.Scanner;

import com.pdp.controller.MobileController;
import com.pdp.dao.Data;
import com.pdp.entity.Product;

public class Main {

	public static void main(String[] args) {

		int id, choice;
		String name;
		double price;
		int a = 1;

		Scanner sc = new Scanner(System.in);
		MobileController mc = new MobileController();
		Data dao = new Data();

		do {
			System.out.println();
			System.out.println("------------ MENU ------------");
			System.out.println("1. Add the product into database ");
			System.out.println("2. Read/Display the product from dabase");
			System.out.println("3. Update the product into database ");
			System.out.println("4. Delete the product from database");
			System.out.println("5. Find the product by using id ");
			System.out.println("6. Exit...");

			System.out.println("enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {

				System.out.println("How many size of Array you want to create");
				int cap = sc.nextInt();
				new MobileController(cap); // passing the capacity of MobileConstroller constructor

				System.out.println("how many product add into database : ");
				int num = sc.nextInt();
				Product[] p = new Product[num];

				for (int i = 0; i < num; i++) {

					System.out.print("enter " + a + " product id : ");
					id = sc.nextInt();
					System.out.print("enter " + a + " product name : ");
					name = sc.next();
					System.out.print("enter " + a + " product price : ");
					price = sc.nextDouble();

					p[i] = new Product(id, name, price);
					System.out.println("MObile " + a + " added successfully.");
					a++;
				}
				mc.addProduct(p);

			}
				break;

			case 2: {

				Product[] parray = mc.getAllData();
				for (Product product : parray) {
					System.out.println(product);
				}

				break;
			}

			case 3: {
				System.out.print("Enter product ID to update: ");
				id = sc.nextInt();
				mc.updateProduct(id);

				break;
			}

			case 4: {

				System.out.println("Enter Product Id Which you want to delete");
				id = sc.nextInt();
				mc.deleteProduct(id);

				break;
			}
			case 5: {
				System.out.println("which id do you find : ");
				id = sc.nextInt();
				Product p = mc.findProductById(id);
				System.out.println(p);
				break;

			}

			case 6: {
				System.out.println("Thank you for used our application...");
				break;
			}
			default: {
				System.out.println("Invalid input... \n Please Try again enter to current opearion \n Thank you...");
				break;
			}

			}

		} while (choice != 6);

	}

}
