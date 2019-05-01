package day35_practice;

public class DecryptionFun {

	public static void main(String[] args) {
		System.out.println(decryptChar('a'));
		
		System.out.println(decryptWord("java"));
		
		System.out.println(decryptSentence("java is fun"));

	}
	
	
	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encrypted.charAt( alphabet.indexOf(ch) );
		int i = encrypted.indexOf(ch);
		char ret = alphabet.charAt(i);
		return ret;
	}
	
	public static String decryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += decryptChar(word.charAt(i));
		}
		return cyphered;		
	}
	
	public static String decryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += decryptWord(word)+" ";
		}
		return retValue.trim();
	}
	

}
