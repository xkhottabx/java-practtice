package day20_forloop;

public class IndexOf {

	public static void main(String[] args) {
		String word="amazon";
		char letter='a';
		int index = -1;

		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i)==letter) {
				index=i;
				break;//exit the loop
				
			}
			
		}
		System.out.println(index);
	}

}
