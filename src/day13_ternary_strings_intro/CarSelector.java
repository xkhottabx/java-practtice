package day13_ternary_strings_intro;

import java.util.Scanner;

public class CarSelector {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int carType;
		double averagePrice = 0;
		String carOptions = null;
		System.out.println("What type are you interested in?");
		
		carType = scan.nextInt();
		
		switch(carType) {
		case 1:
			averagePrice=33000;
			carOptions="Ford, Dodge, Tesla, Chevrolet, Lincoln";
			break;
		case 2:
			averagePrice=32000;
			carOptions="Toyota, Mitsubisi, Honda, Subaru, Mazda";
			break;
		case 3:
			averagePrice=55000;
			carOptions="Bmw, VW, Audi, Mercedes, Porsche";
			break;
		case 4:
			averagePrice=85000;
			carOptions="Alfa Romeo, Ferrari, Lamborghini, Fiat";
			break;
		case 5:
			averagePrice=25000;
			carOptions="Kia, Hyundai, Daewoo";
			break;
			default:
				System.out.println("Not available");
				return;
					
		}
		System.out.println("price "+averagePrice);
		System.out.println("Car options "+carOptions);
		
		
	}

}
