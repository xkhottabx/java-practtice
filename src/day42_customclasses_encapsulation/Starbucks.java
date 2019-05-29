package day42_customclasses_encapsulation;
import java.util.*;
public class Starbucks {
	public static void main(String[] args) {
		//declare an array that can store two coffee objects
		//int[] nums=new int[2];
		Coffee[] coffeeArray=new Coffee[2];//1st option
		coffeeArray[0]=new Coffee();
		//access coffee object in index 0 and set data
		coffeeArray[0].setCoffeeInfo("Expresso", "TALL", 2.55, 7);
		coffeeArray[0].getCoffeeInfo();
//========================================================================================		
		Coffee latte=new Coffee();//2nd option
		latte.setCoffeeInfo("Latte cafe", "GRANDE", 3.85, 190);
		coffeeArray[1]=latte;
		
		coffeeArray[1].getCoffeeInfo();
		
	}
}
