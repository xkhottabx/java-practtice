package day21_looprecap;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=0, num2=0;
		System.out.println("First number:");
		num1=scan.nextInt();
		System.out.println("Second number:");			//DO WHILE IS A GOOD OPTION FOR THIS TASK
		num2=scan.nextInt();
		
		
		while ((num1+num2)<=100) {
			System.out.println("First number:");
			num1=scan.nextInt();
			System.out.println("Second number:");
			num2=scan.nextInt();
			if ((num1+num2)>100) {
				System.out.println("Good numbers");
				return;
			}
		}
		
		

	}

}
