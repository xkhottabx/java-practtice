package day16_string_manipulation;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sentence="I wrote [12] lines of code today.";
		int first=sentence.indexOf("[");
		int last=sentence.indexOf("]");
		String codeCount=sentence.substring(first+1, last);
		System.out.println(sentence.substring(first+1, last));
		int count=Integer.parseInt(codeCount);//convert String to Integer
		if (count>20) {
			System.out.println("Good");
		}
		else {
			System.out.println("Something is wrong");
		}
		
		

	}

}
