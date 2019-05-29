package day39_arraylist04;

import java.util.ArrayList;

public class Cities {
public static void main(String[] args) {
	ArrayList<String> cities = new ArrayList<>();
    
    cities.add("Tokyo");
    cities.add("New York");
    cities.add(0,"Paris");
    cities.add("Pittsburgh");
    cities.add(1,"Berlin");
    cities.add("Madrid");
    cities.add("Moscow");
    cities.add("Istanbul");
    cities.add("Washington D.C.");
    cities.add("Amsterdam");
    cities.add("Zurich");
    cities.add("Singapore");
    cities.add("Milan");
    cities.add("Toronto");
    cities.add("London");
    cities.add("Ufa");
    String list="";
    
    
    for (String city: cities) {
    	list+=city+"|";
    }
    System.out.println(list);
    
    for (int i=0; i<cities.size(); i++) {
    	String city=cities.get(i).toUpperCase();
    	cities.set(i, city);
    }
    System.out.println(cities.toString());
    
    //FIND THE LONGEST CITIES
    String longestCity="", shortestCity="";
    int max=Integer.MIN_VALUE;
    for (String city: cities) {
   if (city.length()>longestCity.length()) {
	   longestCity=city;
   }
    }
    shortestCity=cities.get(0);
    for (String city: cities) {
    	   if (city.length()<shortestCity.length()) {
    		   shortestCity=city;
    	   }
    	    }
    System.out.println(longestCity);
    System.out.println(shortestCity);
    
    ArrayList<String> citiesMoreThan6 = new ArrayList<>();
    for (String city6: cities) {
    	if (city6.length()>6) {
    		citiesMoreThan6.add(city6);
    	}
    }
    System.out.println(citiesMoreThan6);
}
}
