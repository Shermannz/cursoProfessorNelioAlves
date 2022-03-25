 package aplication;

import java.util.Scanner;

public class programa_matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        
        int[][] mat = new int[n][n];
        
        for ( int i=0; i<mat.length; i++) {
        	for(int j=0; j<mat[i].length ;j++) {
        		mat[i][j] = entrada.nextInt();
        
        	}
        }
        
        System.out.println("Main diagonal: ");
        for(int i=0; i<mat.length; i++) {
        	System.out.print(mat[i][i] + " ");
        }
		System.out.println();
		
		int count = 0;
		for(int i=0; i<mat.length; i ++) {
			for(int j=0; j<mat[i].length;j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
			
		
		entrada.close();
	}

}
