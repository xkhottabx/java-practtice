package day52_inheritance05;

public class FinalMethods {
	public final void method1() {
		System.out.println("Final method 1");
	}
	
	class Sub extends FinalMethods{
		public final void method1() {
			System.out.println("Final method 1");
		}
	}
}
