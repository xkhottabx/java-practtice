package day49_inheritance02;

public class Leopard extends Animal {
	public Leopard() {
		super();//call parent class no-args constructor
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	
	public Leopard(String type) {
		super(type);//call animal (String type)
		System.out.println("Animal constructor 1 arg L");
		
	}
}
