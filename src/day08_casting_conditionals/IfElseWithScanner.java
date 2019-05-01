package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int pass=65;
		int score;
		score=scan.nextInt();
		if ((score>=pass) && (score<=100)) {
			System.out.println("pass");
		}
		else {System.out.println("failed");
		}

	}

}
