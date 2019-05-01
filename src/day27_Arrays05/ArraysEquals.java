package day27_Arrays05;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		int[] nums1= {4,5,6,7,8,9,10};
		int[] nums2= {4,5,6,7,8,9,10};
		System.out.println(Arrays.equals(nums1, nums2));//TRUE
		
		String[] strArr1= {"one","two","three"};
		String[] strArr2= {"One","two","three"};
		
		System.out.println(Arrays.equals(strArr1, strArr2));//FALSE

	}

}
