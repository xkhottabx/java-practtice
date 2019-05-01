package day18_while_dowhile_loop;

import java.util.Scanner;

public class EnterPincode {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int pin=0;
		while (pin!=1234) {
			System.out.println("Enter pin");
			pin=scan.nextInt();
			
		}
		System.out.println("Access granted");

	}

}
