package day22_Practice;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int month=0;
		do {
			System.out.println("Enter month:");
		month=scan.nextInt();
		if (month<1 || month>12) {
			System.out.println("WRONG");
			return;}
		
		}while (month>=1 || month<=12);
		}
		

	

}
