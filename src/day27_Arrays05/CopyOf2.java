package day27_Arrays05;

import java.util.Arrays;

public class CopyOf2 {

	public static void main(String[] args) {
		int[] nums1= {34,56,23,1,55};
		int[] nums2= Arrays.copyOf(nums1, nums1.length+2);
		int[] nums3= Arrays.copyOfRange(nums1, 1, 3);
		System.out.println(Arrays.toString(nums2));//[34, 56, 23, 1, 55, 0, 0]
		
		System.out.println(Arrays.toString(nums3));//[56, 23]
		
		int[] newArr= {34,23,54,23};
		newArr=Arrays.copyOf(newArr, newArr.length+5);
		
		System.out.println(Arrays.toString(newArr));//[34, 23, 54, 23, 0, 0, 0, 0, 0]
	}

}
