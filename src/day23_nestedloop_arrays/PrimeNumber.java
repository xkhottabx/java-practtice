package day23_nestedloop_arrays;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for (int i=2; i<num; i++) {
		if (num%i!=0) {
			System.out.println("Prime number");
		}
				
			else {
				System.out.println("Not a prime number");
			}
		}

	}

}
