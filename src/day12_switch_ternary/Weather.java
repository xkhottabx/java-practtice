package day12_switch_ternary;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		String weather;
		Scanner scan=new Scanner(System.in);
				
				weather=scan.next().toLowerCase();
		switch(weather) {
		case "sunny":
			System.out.println("Go Java");
			break;
		case "rainy":
			System.out.println("Go Java anyway");
			break;
			default:
				System.out.println("Don't think about weather, just do Java");
		}
		

	}

}
