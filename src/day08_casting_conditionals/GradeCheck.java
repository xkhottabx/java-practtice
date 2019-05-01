package day08_casting_conditionals;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// A,B,C,D
		Scanner scan=new Scanner(System.in);
		char grade=scan.next().charAt(0);
		if (grade=='A') {
			System.out.println("Excellent job");
		}
		else {
			System.out.println("your grade "+grade+" is not good enough");
			System.out.println("How namy you miss");
		int miss=scan.nextInt();
		System.out.println("You need more "+miss);
	
			//System.out.println("Your grade is not good enough");
		}
		
	}

}
