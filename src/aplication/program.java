package aplication;

import java.util.Scanner;

import entities.Triangle;

public class program {

	public static void main(String[] args) {
		
    Scanner entrada = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
	 
	 System.out.println("Enter the measures of triangle X: ");
     x.a = entrada.nextDouble();
     x.b = entrada.nextDouble();
     x.c = entrada.nextDouble();
	 
     System.out.println("Enter the measures of triangle Y: ");
     y.a = entrada.nextDouble();
     y.b = entrada.nextDouble();
     y.c = entrada.nextDouble();
	 
     double p = (x.a + x.b + x.c) / 2.0;
     double areaX = Math.sqrt(p*(p-x.a) * (p-x.b) * (p-x.c));
     
       p = (y.a + y.b + y.c) / 2.0;
     double areaY = Math.sqrt(p*(p-y.a) * (p-y.b) * (p-y.c));
	 
     System.out.printf("Triangle X area: %.4f\n", areaX); // %n e \2 é pra pular linha
     System.out.printf("Triangle Y area: %.4f%n", areaY);
     
     if(areaX > areaY) {
    	 System.out.println("Large area: X");
     } else {
    	 System.out.println("Large area: Y");
     }
	 
		
	 entrada.close();		
	}
}
