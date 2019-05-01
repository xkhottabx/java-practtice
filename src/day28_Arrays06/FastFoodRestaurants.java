package day28_Arrays06;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		// READ ALL DATA AND ASSIGN TO ARRAY
		String[] data=Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: "+data.length);
		
		//print each restaurant information in separate line
		int counter=0;
		for (String str:data) {
			//System.out.println("#"+counter+"=>"+str);
			counter++;
		}
		System.out.println();
				//print  row
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		
		System.out.println();
		int va=0;
		//PRINT ALL RESTAURANT INFO FOR VA
		for (String str:data) {
			if (str.contains(",VA,") && str.contains("22102")){
			System.out.println(str);
			va++;
			}
		}
		System.out.println(va);
		
		
		for (String str:data) {
			if (str.contains(",VA,")){
				String[]resArr=str.split(",");
			System.out.println(resArr[1]+" "+resArr[2]);
			va++;
			}
		}
	}

}
