package day28_Arrays06;

import java.util.Arrays;

public class ReversingSentence {

	public static void main(String[] args) {
		String sentence="I want to code Java";
		String []str=sentence.split(" ");
		String newS="";
		for (int i=str.length-1; i>=0; i--) {
			newS+=str[i]+" ";
		}
		System.out.println(newS);
		//DO IT WITH FOR EACH LOOP

		

	}

}
