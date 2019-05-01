package day24_Arrays;

public class Cities {

	public static void main(String[] args) {
		String[] cities= {"Washington D.C.", "New York", "Annandale", "Norfolk", "Annapolis", "Philadelphia", "Miami", "Arundel"};
			System.out.println(cities.length);	//length of array
			
			System.out.println();
			for (int i=0; i<cities.length; i++) {
				if (cities[i].startsWith("A")) {
					System.out.println(cities[i]);
				}
			}
			System.out.println();
			
			for (String city: cities) {//FOR EACH LOOP
				if (city.startsWith("N")) {
					System.out.println(city);
				}
			}
			
			System.out.println(cities[0]);

	}

}
