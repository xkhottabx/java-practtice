package day24_Arrays;

public class CombinationsOfTwoLetters {

	public static void main(String[] args) {
		for (char letter2='a'; letter2<='e'; letter2++) {
		for (char letter='a'; letter<='e'; letter++) {
			System.out.println(letter2+""+letter);
		}
		}

	}

}
