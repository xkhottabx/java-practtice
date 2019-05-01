package day30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {

	public static void showMe5Numbers() {
		Random r=new Random();
		
		for (int i=0; i<=5; i++) {
			System.out.print(r.nextInt(1001)+", ");//PRINT RANDOM NUMBER
		}
		System.out.println();
		
	}
	
	
	
	public static void doPush10Ups() {
		for (int i=1; i<=10; i++) {
			System.out.println("Pushup - "+i);
		}
		System.out.println("Time to rest");
		System.out.println();
		
		
		
		
	}
	public static void rangePrint() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 nums:");
		int firstNum=scan.nextInt();
		int secondNum=scan.nextInt();
		if (secondNum>firstNum) {
		for (int i=firstNum; i<=secondNum; i++) {
			System.out.print(i+" ");
		}
		}
		else if (secondNum<firstNum) {
			for (int i=firstNum; i>=secondNum; i--) {
				System.out.print(i+" ");
			}
			}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		
		doPush10Ups();
		doPush10Ups();
		
		
		rangePrint();
		

	
	}
}
