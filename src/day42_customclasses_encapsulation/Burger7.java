package day42_customclasses_encapsulation;
import java.util.*;
public class Burger7 {
	public static void main(String[] args) {
		Burger burger1=new Burger();
	burger1.name="Cowboy";
	String[] ings= {"onion", "cheese", "lettuce"};
	burger1.ingredients=ings;
	System.out.println(burger1.name);
	System.out.println(Arrays.toString(burger1.ingredients));
	
	System.out.println(burger1.ingredients[0]);
	
	for(String ings2: burger1.ingredients) {
		System.out.println(ings2);
	}
}
}