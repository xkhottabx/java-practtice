package day37_arraylist;

import java.util.ArrayList;

public class MyCities {

	public static void main(String[] args) {
		ArrayList<String> cities =new ArrayList<>();
		cities.add("Washington D.C.");
		cities.add("New York");
		cities.add("Chicago");
		cities.add("Charlotte");
		cities.add("Philadelhia");
		cities.add("Charlotte");
		
		for (String city: cities) {
			System.out.print(city+" ");
		}
		System.out.println();
		for (int i=0; i<cities.size(); i++) {
			System.out.print(cities.get(i)+" ");
		}
		
		cities.remove("Charlotte");//
		System.out.println(cities.toString());
		
		//isEmpty?
		System.out.println("Is list empty? " +cities.isEmpty());//false
		
		cities.add(0,"Miami");//0 - position
		
		System.out.println(cities.toString());
		
		cities.set(2, "Detroit");
		System.out.println(cities.toString());
		
		int idx=cities.indexOf("Chicago");
		System.out.println(idx);
		
		cities.set(idx, "San-Francisco");
		System.out.println(cities.toString());
		
		cities.clear();
		boolean empty=cities.isEmpty();	
		System.out.println(empty);//true
		
		
		

	}

}
