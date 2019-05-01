package day20_forloop;

public class PrintEachChar {

	public static void main(String[] args) {
		String word="Amazon";
		for (int i=0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		for (int i=0; i<word.length(); i++) {
			char letter=word.toLowerCase().charAt(i);
			if (letter=='a' || letter=='e' || letter=='o' || letter=='i' || letter=='u') {
				System.out.print(letter+", ");
			}
		}

			for (int i=0; i<word.length(); i++) {
				char letter=word.toLowerCase().charAt(i);
				if (!(letter=='a' || letter=='e' || letter=='o' || letter=='i' || letter=='u')){
					System.out.print(letter+", ");
				}
						
		}
		
		
	}

}
