package day28_Arrays06;

import java.util.Arrays;

public class NumbersMultiDArray {

	public static void main(String[] args) {
		int[][]nums=new int[3][4];
		nums[0][0]=100;
		nums[0][1]=34324;
		nums[0][2]=13200;
		nums[0][3]=342;
		
		nums[1][0]=1230;
		nums[1][1]=31231;
		nums[1][2]=2520;
		nums[1][3]=565;
		
		nums[2][0]=1430;
		nums[2][1]=3451;
		nums[2][2]=2530;
		nums[2][3]=54555;
		
		System.out.println(Arrays.deepToString(nums));
		
		
		int[][] scores= {{3,5,10},{6,4,2,10}};
		
		System.out.println("Days played/numbers of arrays "+scores.length);
		System.out.println("Number of values in 1: "+scores[0].length);
		System.out.println("Number of values in 2: "+scores[1].length);
		
		int [][] values=new int[4][];
		values[0]=new int[] {34,23,5};
		values[1]=new int[] {34,23,5,454,4,454,4,5454,3};
		values[2]=new int[2];
		values[2][0]=55;
		
		values[3]=new int[] {5,12,534,64434,67,34};
		
		System.out.println(Arrays.deepToString(values));
		

	}

}
