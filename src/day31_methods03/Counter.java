package day31_methods03;

public class Counter {

	public static void main(String[] args) {
		countUp(22);
		countDown(6);

	}
//****************************************************************************************************************************************
public static void countUp(int num1) {
		if (num1>1) {
			for (int i=1; i<=num1; i++) {
				System.out.print(i+" ");
			}
		}
		else {
			System.out.println("INVALID INPUT");
		}
		System.out.println();

	}
	
//****************************************************************************************************************************************
public static void countDown(int num2) {
	
	
	if (num2>1) {
		for (int i=num2; i>=1; i--) {
			System.out.print(i+" ");
		}
	}
	else {
		System.out.println("INVALID INPUT");
	}
	
}

}
