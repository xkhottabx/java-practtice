package day35_practice;

import java.util.Scanner;

public class EncryptionFunV1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word="umbrella";
		String eWord="";
		
		
//		char first=word.charAt(0);//'e'
//		int position=alphabet.indexOf(first);//4
//		char enChar=encrypted.charAt(position);//v
//		System.out.println(first+"-->"+enChar);
		
		
		
		
		
		
		for (int i=0; i<word.length(); i++) {
			char first=word.charAt(i);//'e'
			int position=alphabet.indexOf(first);//4
			char enChar=encrypted.charAt(position);//v
			eWord+=enChar;
		}

		System.out.println(word);
		System.out.println(eWord);
	}

}
