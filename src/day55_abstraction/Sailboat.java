package day55_abstraction;

public class Sailboat extends Vehicle {
	private int length;

	public Sailboat(int wheels, double price, String type, int length) {
		super(wheels, price, type, "wind");
		this.length=length;
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	public int getLength() {
		return length;
	}

	
	
}
