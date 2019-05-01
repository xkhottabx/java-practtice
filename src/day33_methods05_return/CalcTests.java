package day33_methods05_return;

public class CalcTests {

	public static void main(String[] args) {
		System.out.println(WarmUpTask.add(4, 5));
		System.out.println(WarmUpTask.multiply(6, 7));
		System.out.println(WarmUpTask.minus(7, 2));
		System.out.println(WarmUpTask.divide(90, 30));
		
		
		int addResult=WarmUpTask.add(21, 21);
		double mResult=WarmUpTask.multiply(50, 40);
		
		System.out.println(addResult);
		System.out.println(mResult);
		
		double a=10.0, b=5.0;
		double myResult=WarmUpTask.minus(a, b);
		System.out.println(myResult);
		
		double [] dNums= {2,4};
		double result2=WarmUpTask.multiply(dNums[0], dNums[1]);
		System.out.println(result2);
		
		if (WarmUpTask.add(10, 16)==26) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

	}

}
