package day37_arraylist;

import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {
		ArrayList<String> shoppingList=new ArrayList<>();
		shoppingList.add("avocado");
		shoppingList.add("kiwi");
		shoppingList.add("spaghetti");
		shoppingList.add("oranges");
		shoppingList.add("hummus");
		shoppingList.add("watermelon");
		
		int count=shoppingList.size();
		System.out.println(count);
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0)+" | "+shoppingList.get(count-1));
		
		shoppingList.remove("spaghetti");
		shoppingList.remove("avocado");
		System.out.println(shoppingList.toString());
		
		for (String item: shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());//[]
		System.out.println(shoppingList);//[]
		
	}

}
