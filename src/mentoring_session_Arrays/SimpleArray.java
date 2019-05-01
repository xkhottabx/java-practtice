package mentoring_session_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] arr1=new int[size];
//		for (int num: arr1) {
//										//FOR EACH LOOP IS NOT GONNA WORK HERE
//				num=scan.nextInt();
//				
//			}
		
		for (int i=0; i<size; i++) {
			arr1[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr1));
			
		int[] arrE= {10,0,40,3,5,3,0};
		
		for (int e: arrE) {
			if (e!=0) {
				e+=25;
				//System.out.println(e);
			}
		}	
		
		for (int i=0; i<size; i++) {
			
			if (arr1[i]%2==0) {
				arr1[i]++;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		
//		for (int num1:arr1) {
//			if (num1<=7) {
//				num++;			YOU CANNOT MODIFY AN ARRAY IN THAT WAY
//			}
//		}
	}

}
