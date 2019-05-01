package day19_loops;

public class PrintLetters {

	public static void main(String[] args) {
		String word="Cybertek";
		int idx=0;
		while (idx<word.length()) {
			
			System.out.println(word.charAt(idx++));
			//idx++;
		}
		
		int idx2=word.length()-1;
			while (idx2>=0) {
			System.out.print(word.charAt(idx2--));
			
		}
	}

}
