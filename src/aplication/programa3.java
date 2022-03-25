package aplication;

import java.util.Scanner;

import entities.conta;

public class programa3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		conta account;

		System.out.print("Enter account number: ");
		int number = entrada.nextInt();
		System.out.print("Enter account holder: ");
		entrada.nextLine();
		String holder = entrada.nextLine();
		System.out.print("Is there an initial deposit (y/n) : ");
		char response = entrada.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = entrada.nextDouble();
			account = new conta(number, holder, initialDeposit);
		} else {
			account = new conta(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = entrada.nextDouble();
		
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = entrada.nextDouble();
		
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);

		entrada.close();

	}

}
