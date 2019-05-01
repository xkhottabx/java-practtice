package day21_looprecap;

import java.util.Scanner;

public class GetUniqueCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word");
		String word=scan.next();//javva
		String unique="";
		for (int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if (unique.indexOf(ch)==-1) {// IF (!UNIQUE.CONTAINS(""+CH)
				unique+=ch;
			}
			
		}
		System.out.println("Unique:" + unique);
		

		

	}

}
