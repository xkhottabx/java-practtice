package day15_string_manipulations;

import java.util.Scanner;

public class Emoji {

	public static void main(String[] args) {
		String emoji;
		Scanner scan=new Scanner(System.in);
		emoji=scan.next();
		if (!(emoji.length()==2)) {
			System.out.println("Invalid input");
			return;
		} 
		
		if (emoji.charAt(0)==':') {
			if (emoji.charAt(1)==')') {
				System.out.println("smile");
			}
			else if (emoji.charAt(1)=='(') {
				
				System.out.println("sad");
			}
			else {
				System.out.println("Invalid input");
				return;
			}
		}
			if (emoji.charAt(0)==';') {
				if (emoji.charAt(1)==')') {
					System.out.println("cry");
				}
				else if (emoji.charAt(1)=='(') {
					
					System.out.println("cry too much");
				}
				else {
					System.out.println("Invalid input");
					return;
			}
			}
		

	
		}
}
