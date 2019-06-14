package day55_abstraction;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	
	
	public void speak() {
		System.out.println("meow-meow");
	}
}
