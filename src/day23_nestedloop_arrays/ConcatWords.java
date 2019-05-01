package day23_nestedloop_arrays;

import java.util.Scanner;

public class ConcatWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String word="";
		String total="";
		for (int i=0; i<6; i++) {
			System.out.println("Enter a word:");
			word=scan.next();
			if (word.equalsIgnoreCase("java")) {
				continue;
			}
			total+=(word+", ");
		}
			System.out.println("total: "+(total.length()>1? total.substring(0, total.length()-2): ""));//ternary condition

	}

}
