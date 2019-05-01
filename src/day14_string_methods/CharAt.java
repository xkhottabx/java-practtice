package day14_string_methods;

public class CharAt {

	public static void main(String[] args) {
		String word="JAVA IS FUN";
		int i;
		for (i=0; i<word.length(); i++) {
		System.out.println(word.charAt(i));
		}
		for (i=word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i));
			}
		
		System.out.println();
		String word2="Java";
		String word3="Python";
		String charE=(word2.charAt(0)=='J') ? "yes": "no";
		String FLmatch=(word2.charAt(3)==word3.charAt(3)) ? "yes": "no";
		System.out.println(charE);
		System.out.println(FLmatch);
		
		String word4="degfefege";
		System.out.println(word4.charAt(word4.length()-1));  ////////PRINT LAST CHARACTER OF THE WORD
		
	
		
	}

}
