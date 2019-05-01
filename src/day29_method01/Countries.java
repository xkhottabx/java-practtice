package day29_method01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		String[][]countries=new String[5][2];
			countries[0][0]="USA";
			countries[0][1]="Washington D.C.";
			countries[1][0]="Canada";
			countries[1][1]="Ottawa";
			countries[2][0]="Italy";
			countries[2][1]="Rome";
			countries[3][0]="Spain";
			countries[3][1]="Madrid";
			countries[4][0]="Ukraine";
			countries[4][1]="Kyiv";
			
			System.out.println(Arrays.deepToString(countries));
			
			for (int i=0; i<countries.length; i++) {
				System.out.print(countries[i][0]+" ");
			}
			System.out.println();
			//FOR EACH LOOP
			for (String[] country: countries) {
				System.out.print(country[0]+" ");
			}
			System.out.println();
			String[] newArr=new String[countries.length];//copy [] from 2D array to regular Array
			for (int i=0; i<countries.length; i++) {
				newArr[i]=countries[i][1];
			}
			System.out.println(Arrays.toString(newArr));
			System.out.println();
			
			for(int i=0; i<countries.length; i++) {
				if (countries[i][0].equals("USA")) {
					if (countries[i][1]=="Washington D.C.") {
					System.out.println("Good");
				}
				else {
					System.out.println("Bad");
									}
					break;//exit the loop
				}
			}
	}

}
