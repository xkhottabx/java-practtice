package day20_forloop;

public class CountHowMany {

	public static void main(String[] args) {
		String word="computer programming";
		char myChar='m';
		int i=0, counter=0;
		for (i=0; i<word.length(); i++) {
			if (word.charAt(i)==myChar) {
				counter++;
			}
			
		}
		System.out.println(counter);
	}

}
