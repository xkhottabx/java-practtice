package day34_methods06_return;

import java.util.Arrays;

public class VarArgs {

	public static void main(String... anything) {//YOU CA USE THREE DOTS FOR MAIN METHOD
	printWords("java","selenium");
	printWords("FUN");
	printWords();//empty array
	int sM=sum(10,20,88,98,56);
	System.out.println(sM);
	
	cook("Dish","Falafel", "rice", "vegs");
	
	shoppingList(1000, "Avocado", "Watch", "Car");

	}
	
	
public static void printWords(String... words) {
		//handle it like ARRAY
		for (String w: words) {
			System.out.println(w);
		}

	}

public static int sum(int... nums) {
	int sum=0;
	for (int s: nums) {
		sum+=s;
	}
	return sum;
	

}

public static void cook(String name, String... ings) {
	System.out.print("Food: " + name);
	System.out.println(Arrays.toString(ings));
	
}

public static void shoppingList(int totalPrice, String... items) {
	System.out.print("Total cost: " + totalPrice);
	System.out.println(Arrays.toString(items));
	
}



}
