package day19_loops;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your current balance:");
		double balance=scan.nextDouble();
		double transaction;
		int count=0;
		
		while (balance>0) {
			count++;
			System.out.println("Enter transaction #"+count+" amount:");
			
			transaction=scan.nextDouble();
			if (balance<transaction) {
				System.out.println("Not enough money");
				
			}
			balance-=transaction;
			
			System.out.println("Balance: "+balance);
			
		}
		System.out.println("Successful transaction amount: "+count);
	}

}
