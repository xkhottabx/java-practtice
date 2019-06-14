package day58_interfaces02;

public class ClassA  implements Cloneable, Bees{
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.Kelp();
	}
	@Override
	public Object clone() {
		System.out.println("Cloning");
		//any custom code to run when cloning 
		return null;
		}
	
	@Override
	public void Kelp() {
		System.out.println("Override");
	}
}
 interface Bees {
	 default void Kelp()
	 {
		System.out.println("Default"); 
	 }
 }