package day38_arraylist03;
import java.util.*;
public class EqualsMethod {

	public static void main(String[] args) {
		List<String> friends1=new ArrayList<>();
		List<String> friends2=new ArrayList<>();
		
		friends1.add("Vlad");
		friends1.add("John");
		
		
		friends2.add("Vlad");
		friends2.add("John");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		System.out.println(friends1.equals(friends2));//order matters
		

	}

}
