package day23_nestedloop_arrays;

public class PrintNumbersWithLoop2 {

	public static void main(String[] args) {
		for (int i=10; i>=1; i--) {
			for (int j=1; j<=i; j++)
			System.out.print(j+" ");
			System.out.println();
		}
		

	}

}
