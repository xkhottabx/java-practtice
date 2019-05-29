package practice;

public class CanBalance {

	public static void main(String[] args) {
//		https://codingbat.com/prob/p158767
	
		int[] nums= {1, 1, 1, 1, 4};
		
		int n=nums.length;
		int sum1=0, sum2=0, count=1, counter=0;
		
		for (int i=0; i<n; i++) {
			sum1+=nums[i];
			for (int j=count; j<n; j++) {
				sum2+=nums[j];
			}
			if (sum1==sum2) {
				counter++;
				break;
			}
			else {
				sum2=0;
			}
			count++;
		}
	
	System.out.println(counter>0 ? true: false);	
		
	}

}
