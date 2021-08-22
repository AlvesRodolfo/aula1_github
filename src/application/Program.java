package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
						
		product produto = new product(name, price); //FORNECENDO VALOR NA INSTANCIAÇÃO
		
		System.out.println();
		System.out.println("Product data: " + produto );
		
		produto.setName("Computer");
		System.out.println("Updated name = " + produto.getName());
		produto.setPrice(1200);
		System.out.println("Updated price = " + produto.getPrice());
		
		
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + produto);
		
		//teste github!
		//teste github2!
		
		sc.close();
	}

}
