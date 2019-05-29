package day38_arraylist03;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		
		ArrayList<String> list2=list1;// list1, list2 point to same object
		//COPY ALL VALUES FROM LIST1
		ArrayList<String> months=new ArrayList<>(list1);
		System.out.println(months);
		
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		System.out.println(months);
		
		System.out.println(months.indexOf("Feb")==1);
		System.out.println(months.get(1).equals("Feb"));
		
		
		ArrayList<String> month2=new ArrayList<>(list1);
		System.out.println("Month: "+months.toString());
		System.out.println("Month2: "+month2.toString());
		
		System.out.println(months.containsAll(month2));
		
		//add one more Jan to month2
		
		month2.add("Jan");
		System.out.println(months.containsAll(month2));//still true
		
		
		
		
		
		

	}

}
