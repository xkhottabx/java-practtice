package day19_loops;

public class DoWhileRunOnce {

	public static void main(String[] args) {
		//do while loop will run once then test the condition
		//then exit the loop, as condition is false
		int count=10;
		do {
			System.out.println("Count: "+count);
			count++;
		} while (count<=5);

	}

}
