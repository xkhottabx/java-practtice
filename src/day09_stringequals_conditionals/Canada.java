package day09_stringequals_conditionals;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String capital;
		System.out.println("What is the capital of Canada?");
		capital=scan.next();
		if (capital.equalsIgnoreCase("Ottawa")) {
			System.out.println("Good");
		}
		else {
			System.out.println("no. "+capital+" is not a right answer");
		}

	}

}
