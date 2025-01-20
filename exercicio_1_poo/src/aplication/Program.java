package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		entities.product product = new product();
		
		System.out.println("Enter rectangle width and height:");
		product.height = sc.nextDouble();
		product.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", product.area());
		System.out.printf("PERIMETER = %.2f%n", product.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", product.diagonal());
		
		
		sc.close();
	}

}
