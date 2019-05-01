package day24_Arrays;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		int[] numbers=new int[3];
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=20;
		System.out.println(Arrays.toString(numbers));//will print an array as a string
		
		int sum=0;
		for (int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
					}
		System.out.println(sum);
	
	
	//find largest value in the array
	
	int max=Integer.MIN_VALUE;
	
	for (int i=0; i<numbers.length; i++) {
		if (numbers[i]>max) {
		max=numbers[i];
		}
	}
	System.out.println("Max value: "+max);
	
	int min=Integer.MAX_VALUE;
	for (int i=0; i<numbers.length; i++) {
		if (numbers[i]<min) {
			min=numbers[i];
		}
		
	}
	System.out.println("Min value: "+min);
	}
	}
