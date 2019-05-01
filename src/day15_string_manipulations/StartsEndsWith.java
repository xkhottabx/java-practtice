package day15_string_manipulations;

public class StartsEndsWith {

	public static void main(String[] args) {
		String word1="eclipse";
		System.out.println(word1.startsWith("e"));//true
		System.out.println(word1.startsWith("ec"));//true
		System.out.println(word1.startsWith("eclipse"));//true
		
		System.out.println(word1.startsWith("Ec"));//false
		
		
		System.out.println(word1.endsWith("e"));//true
		System.out.println(word1.endsWith("pse"));//true
		System.out.println(word1.endsWith("java"));//false
		
		//PSE
		System.out.println(word1.toUpperCase().endsWith("PSE"));//true
		
		
		String word2="Ms. Jackson";
		if (word2.startsWith("Mr.")) {
			System.out.println("MALE");
		}
		else if	(word2.startsWith("Mrs.")) {
				System.out.println("FEMALE");
		}
		else if	(word2.startsWith("Ms.")) {
			System.out.println("AVAILABLE FEMALE");
		}
		else {
			System.out.println("UNKNOWN");
		}
		
		

	}

}
