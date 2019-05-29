package day36_wrapper_classes_arraylistintro;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		//Create an array list
		ArrayList<String> names=new ArrayList<>();
		
		ArrayList<Integer> nums=new ArrayList<>();
		
		//assign values into arraylist
		
		names.add("Obituary");
		names.add("Terror");
		
		nums.add(44);
		nums.add(3424);
		nums.add(324);
		//READ FROM ARRAYLIST
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());
		
		
	}

}
