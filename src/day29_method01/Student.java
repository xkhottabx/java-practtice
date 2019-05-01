package day29_method01;

public class Student {

	public static void main(String[] args) {
		study();
		study();
		
		sayHello();
		
		code();
		

	}
	
	public static void study() {
		System.out.println("Student is studying");
	}
	
	
	//create a method SAY HELLO
	
	public static void sayHello() {
		System.out.println("Hello Friends!");
	}
	
	//create a method with name code
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}
	
}
