package aplication;

import java.util.Scanner;

import entities.product;

public class programa {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
       
		product Product = new product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		Product.name = entrada.nextLine();
       System.out.print("Price: ");
         Product.price = entrada.nextDouble();
         System.out.print("Quantity in stock: ");
	     Product.quantity = entrada.nextInt();
	    
	     System.out.println("Product data: " + Product); 
	     
	     System.out.println();
	     System.out.print("Enter the number of products to be added in stock: ");
         int quantity = entrada.nextInt();
         Product.addProducts(quantity);
         
         System.out.println();
	     System.out.println("Product data: " + Product); 
	     
	     System.out.println();
	     System.out.print("Enter the number of products to be added in stock: ");
	     quantity = entrada.nextInt();
	     Product.removeProducts(quantity);
	     System.out.println("Product data: " + Product); 
         
         
		entrada.close();
	}}
