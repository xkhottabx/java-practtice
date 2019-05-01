package day23_nestedloop_arrays;

public class FiveRowsOfLetters {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			if (i%2==0) {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter + " ");
			}
			}
			if (i%2!=0) {
				for (char letter = 'z'; letter >= 'a'; letter--) {
					System.out.print(letter + " ");
				}
			}
		
			System.out.println();
			System.out.println("===================================================");
		}

	}

}
