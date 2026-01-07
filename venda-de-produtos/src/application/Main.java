package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		List<Product> myProducts = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int num = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < num; i++) {
			System.out.println("\tProduct #" + (i + 1) + " data");
			
			char prd = ' ';
			
			while(prd != 'c' && prd != 'u' && prd != 'i') {
				System.out.print("Common, used or imported (c/u/i): ");
				prd = scan.next().charAt(0);
				scan.nextLine();
			}
			
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Price: ");
			double price = scan.nextDouble();
			scan.nextLine();
			
			Product newerProduct = null;
			
			if(prd == 'c') {
				newerProduct = new Product(name, price);
			}
			else if(prd == 'u') {
				System.out.print("Manufacture date (dd/MM/yyyy): ");
				String date = scan.nextLine();
				
				newerProduct = new UsedProduct(name, price, date);
			}
			else {
				System.out.print("Customs fee: ");
				double fee = scan.nextDouble();
				
				newerProduct = new ImportedProduct(name, price, fee);
			}
			
			myProducts.add(newerProduct);
		}
		
		System.out.println("\nPrice tags:\n");
		
		for(Product p: myProducts) {
			System.out.println(p.priceTag());
		}
		
	}

}
