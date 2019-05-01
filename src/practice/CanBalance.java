package practice;

public class CanBalance {

	public static void main(String[] args) {
//		https://codingbat.com/prob/p158767
		
//		canBalance([1, 1, 1, 2, 1]) → true
//		canBalance([2, 1, 1, 2, 1]) → false
//		canBalance([10, 10]) → true
		
		boolean balance=false;
		
		int[] nums= {10,40,20,30};
		
		int n=nums.length;
		int sum1=0, sum2=0;
		
		if (n%2==0) {
			for (int i=0; i<n/2; i++) {
				sum1+=nums[i];
			}
			for (int i=n/2; i<n; i++) {
				sum2+=nums[i];
			}
		}
		
	//======================================================================
		if (sum1==sum2) {
			balance=true;
		}
		else {
			balance=false;
		}
	
	System.out.println(balance);
	//==============================================================================================================================		
		
	}

}
