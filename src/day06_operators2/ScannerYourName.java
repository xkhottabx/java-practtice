package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Hi your name is");
		String name=input.next();
		System.out.println(" "+name);
		
	}

}
