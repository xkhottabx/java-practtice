package mentoring_session_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
//if array contains  "s", reverse this word in array
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		String [] arr=new String[size];
		for (int i=0; i<size; i++) {
			arr[i]=scan.next();
		}
		String rev="";
		String[] newArr=new String[size];
		if (size%2==0) {
		for (int j=0; j<arr.length; j++) {
			if (arr[j].contains("s")) {
				for (int i=arr[j].length()-1; i>=0; i--) {
					rev+=arr[j].charAt(i);
				}
				arr[j]=rev;
			}
		}
		System.out.println(Arrays.toString(arr));
		}
		else {
			for (int j=0; j<arr.length; j++) {
				if (arr[j].contains("s")) {
					for (int i=arr[j].length()-1; i>=0; i--) {
						rev+=arr[j].charAt(i);
					}
					arr[j]=rev;
				}
			}
			for (int i=size-1; i>=0; i--) {
				newArr[i]=arr[i];
			}
			System.out.println(Arrays.toString(newArr));
		}
		
		

	}

}
