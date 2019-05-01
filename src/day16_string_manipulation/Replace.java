package day16_string_manipulation;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Type something:");
		String word=scan.nextLine().replace(" ", "").toUpperCase();
		//System.out.println(word.replace("a", "y"));
		//System.out.println(word.replace("sad", "happy"));
		System.out.println(word);
		String word2="nfjodsnvnds";
		word2=word2.replace("cat", "1");
		System.out.println(word2);
	}

}
