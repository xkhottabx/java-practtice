package day22_Practice;

public class Substring_practise {

	public static void main(String[] args) {
		String word="java";
		
		
		for (int i=0; i<word.length(); i++) {
			System.out.println(word.substring(i, i+1));
		}
		for (int i=word.length()-1; i>=0; i--) {
			System.out.println(word.substring(i, i+1));
		}
	}

}
