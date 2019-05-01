package day20_forloop;

public class EvenOrOdd {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int sumOfOdds=0;
		int sumOfEvens=0;
		for (i=1; i<=100; i++) {
			if (i%2==0) {
			System.out.print(i+", ");
			sumOfEvens+=i;
			}
		}
		System.out.println();
		for (j=1; j<=100; j++) {
			if (j%2!=0) {
			System.out.print(j+", ");
			sumOfOdds+=j;
			}
		}
		System.out.println();//do it all in one loop
		
		
		
		System.out.println(sumOfEvens);
		System.out.println(sumOfOdds);
		
		
	}

}
