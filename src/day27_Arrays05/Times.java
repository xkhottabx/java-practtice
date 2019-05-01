package day27_Arrays05;

public class Times {

	public static void main(String[] args) {
		int[] time1= {9,15};
		int[] time2= {15,45};
		if (time1[0]<time2[0]) {
			System.out.println("Time 1 is earlier");
		}
		else if (time1[0]>time2[0]) {
			System.out.println("Time 2 is earlier");
		}
		else  {
			if (time1[1]>time2[1]) {
				System.out.println("Time 2 is earlier");
			}
			else if (time1[1]<time2[1]) {
				System.out.println("Time 1 is earlier");
			}
		
		else   {
			System.out.println("time is equal");
		}
			
		}

	}

}
