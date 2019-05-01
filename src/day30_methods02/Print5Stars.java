package day30_methods02;

import java.util.Scanner;

public class Print5Stars {
	
	
public static void fiveStars() {
		for (int j=0; j<=10; j++) {
	for (int i=0; i<=5; i++) {
		System.out.print("* ");
	}
	System.out.println();
		}
	}

	public static void main(String[] args) {
		fiveStars();
		introduce();

	}
	
	public static void introduce() {
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		System.out.println("Nice to meet you "+name);
	}
	
	
	

}
