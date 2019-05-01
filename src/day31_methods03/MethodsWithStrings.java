package day31_methods03;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		countWords("Java is fun");
		googleSearchResult("About 37,700 results (0.43 seconds)");

	}
	
public static void countWords(String sentence) {
		
		String []arr=sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		

	}

public static void googleSearchResult(String sentence) {
	
	String []arr=sentence.split(" ");
	arr[1]=arr[1].replace(",", "");
	System.out.println("Number of results: "+arr[1]);
	arr[arr.length-2]=arr[arr.length-2].replace("(", "");
	System.out.println("Time in seconds: "+arr[arr.length-2]);
	

}

}
