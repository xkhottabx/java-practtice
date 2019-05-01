package day23_nestedloop_arrays;

public class PrintWord {

	public static void main(String[] args) {
		String word="java";
		//update statement
		for (int i=0; i<word.length(); i++) {
			//condition
			if (word.substring(i, i+1).equalsIgnoreCase("a")) {
				//if condition is true, go back to update statement
				continue;//not print "a"
			}
			System.out.print(word.substring(i, i+1));
		}

	}

}
