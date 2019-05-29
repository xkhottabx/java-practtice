package day39_arraylist04;
import java.util.*;
public class CustomListMethods {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numsList=new ArrayList<>();
		numsList.add(10);numsList.add(10);numsList.add(7);numsList.add(8);numsList.add(8);
		numsList.add(3);numsList.add(4);numsList.add(8);
		printList(numsList);
		ArrayList<Double> numsList1=new ArrayList<>();
		numsList1.add(10.3);numsList1.add(440.3);numsList1.add(135.56);numsList1.add(23.3);numsList1.add(1550.94);numsList1.add(170.3);
		System.out.println(sumList(numsList1));
		System.out.println(nums2(66));
		System.out.println(getRandomList(7));
		List<String> str1=new ArrayList<>();
		str1.add("20");str1.add("22");str1.add("1341");str1.add("224");str1.add("2424");
		System.out.println(convertToIntList(str1));
		
	}
	
	
public static void printList(ArrayList<Integer> nums) {
	for (Integer n: nums) {
		System.out.println(n+" ");
	}
	System.out.println();
}

public static double sumList(ArrayList<Double> nums1) {
double sum=0;
for (double s: nums1) {
	sum+=s;
}
return sum;

}

public static ArrayList<Integer> nums2 (int size) {
	ArrayList<Integer> numsList2=new ArrayList<>();
	for (int i=1; i<=size; i++) {
		numsList2.add(i);
	}
	return numsList2;
}

public static List<Integer> getRandomList (int size) {
	Random r=new Random();//object of Random class
	List<Integer> numsList3=new ArrayList<>();
	for (int i=1; i<=size; i++) {
		numsList3.add(r.nextInt(101));
	}
	return numsList3;
}

public static List<Integer>convertToIntList (List<String> str) {
List<Integer> strL=new ArrayList<>();
for (String num: str) {
	strL.add(Integer.parseInt(num));
}
return strL;

}
}