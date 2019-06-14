package day27_Arrays05;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int[] nums= {43,12,4,1,3,5};
		String str=Arrays.toString(nums);//toString method exists in each and every class
		System.out.println(str);			//used to describe values in formatted string
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages= {"Zulu", "English", "German", "Arabic"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		int[] nums2= {434,145,34,45,31,5};
		Arrays.sort(nums2);
		Arrays.binarySearch(nums, 145);//->1




	}

}
