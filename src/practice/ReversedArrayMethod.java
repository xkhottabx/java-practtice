package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArrayMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		buildArr();
		System.out.println("Reversed array: "+Arrays.toString(reversedArray(scan.nextInt(), scan.nextInt())));
	}
	
public static int[] reversedArray (int size, int... arr1) {
	Scanner scan=new Scanner(System.in);
	
	 arr1=new int[size];
	
	for (int i=0; i<size; i++) {
		arr1[i]=scan.nextInt();
		}
		int count=0;
		int[] newArr=new int[size];
		for (int i=size-1; i>=0; i--) {
			newArr[count]=arr1[i];
			count++;
		}
		return newArr;
	}


	public static void buildArr() {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] arr1=new int[size];
		for (int i=0; i<size; i++) {
			arr1[i]=scan.nextInt();
			}
		System.out.println(Arrays.toString(arr1));
	}

}
