package day23_nestedloop_arrays;

public class LineOfNumbers {
	public static void main(String[] args) {
		int i=0;
		for (i=1; i<=50; i++) {
			if (i%20==0) {
				return;
			}
			if (i%5==0) {
				
				continue;
			}
			 
			System.out.print(i+", ");
		}
	}

}
