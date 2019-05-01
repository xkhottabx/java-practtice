package day21_looprecap;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many items are you purchasing?");
		int amountOfItems=scan.nextInt();
		double price=0, totalPrice=0;
		String item="", totalItem="";
		for (int i=1; i<=amountOfItems; i++) {
			System.out.println("What is item "+i+"?");
			item=scan.next();
			totalItem+=item+", ";
			System.out.println("How much is "+item+"?");
			price=scan.nextDouble();
			totalPrice+=price;
		}
		System.out.println("Your items: "+totalItem.substring(0, totalItem.length()-2));
		System.out.println("Your total Price: $"+totalPrice);

	}

}
