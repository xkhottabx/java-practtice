package day24_Arrays;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		int[] numbers= {2, 41, 213, 21, 42, 12};
		//for (int i=0; i<numbers.length; i++) {
			boolean equals=numbers[0]==numbers[numbers.length-1];
			System.out.println(equals);
			
			char[] newChars=new char[3];
			System.out.println("Value of char: "+newChars[0]);
			System.out.println(newChars);
			
		}

	}


