package estatico;

import java.util.Scanner;

import util.calculator;

public class program1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Enter radius: ");
        double radius = entrada.nextDouble();
        
        double c = calculator.circumference(radius);
        
        double v = calculator.volume(radius);
        
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calculator.PI);
		
		entrada.close();
	}
	
}
