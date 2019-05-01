package day24_Arrays;

public class ArrayForCharts {

	public static void main(String[] args) {
		char[] values= {'a', 'b', 'c'};
		for (char value: values) {
			System.out.println(value);
		}
			System.out.println();
		
		String str="Wooden spoon";
			//this method converts string into array of characters
			char[] chars=str.toCharArray();
			
			for (char c: chars) {
				System.out.print(c+"_");
			}
			System.out.println();
			for (int i=chars.length-1; i>=0; i--) {
				System.out.print(chars[i]+"_");
			}
			System.out.println();
			for (char c: chars) {
				if (c=='o') {
					System.out.print("*");
				}
				else {
					System.out.print(c);
				}
			}
			
	}

}
