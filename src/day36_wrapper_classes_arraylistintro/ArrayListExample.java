package day36_wrapper_classes_arraylistintro;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> languages=new ArrayList<>();
		languages.add("Java");
		languages.add("English");
		languages.add("Russian");
		languages.add("Ukrainian");
		System.out.println(languages.size());//4
		languages.add("Turkish");
		System.out.println(languages.size());//5
		
		//remove java
		languages.remove(0);
		System.out.println(languages.size());//4
		
		System.out.println(languages.toString());
		
		
	}

}
