package day24_Arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// BMW, Honda, Audi, Lincoln, Tesla, Ford, GMC
		String[] cars= {"BMW", "Honda", "Audi", "Lincoln", "Tesla", "Ford", "GMC"};
		for (int i=0; i<cars.length; i++) {
			if (cars[i].startsWith("A")){
				System.out.println(cars[i]);
			}
			if (cars[i].toLowerCase().contains("r")) {
				System.out.println(cars[i]);
			}
			if (cars[i].endsWith("a")) {
				System.out.println(cars[i]);
			}
			
		}
		
		for (String sixLetters: cars) {
			if (sixLetters.length()>=5) {
				System.out.println(sixLetters);
			}
		}
		//for (String swap: cars) {
		System.out.println("Before sorting");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(cars));
	}

}
