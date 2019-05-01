package mentoring_session_Arrays;

import java.util.Arrays;

public class ManipulateAndPrint {

	public static void main(String[] args) {
		int [] arr= {24,0,22,0,1,12,0,34};	
		int max=Integer.MIN_VALUE;
	    for (int k=0; k<arr.length; k++){
	      if (arr[k]>max){
	        max=arr[k];
	      }
	    }
		
		//outer loop
		do {
		if (arr[1]==0) {
			arr[0]/=2;
		}
		
		for (int i=1; i<arr.length-1; i++) {
			if (arr[i+1]==0 && arr[i-1]!=0) {
				arr[i]/=2;
			}
		}
		for (int i=arr.length-1; i>=1; i--) {
			if (arr[i-1]==0) {
				arr[i]/=2;
			}
		}
		
			
//			if (arr[arr.length-2]%2==0) {
//				arr[arr.length-1]/=2;
//			}
			max/=2;
		System.out.println(Arrays.toString(arr));
		}while (max>0);

	}

}
