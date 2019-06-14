package day57_interfaces;

public class Dog implements Pet, Callable {

	@Override
	public void respond() {
		System.out.println("Woof-woof");
		
	}

	@Override
	public void keepAsPet() {
		System.out.println("Dog is keeping outside");
		
	}

}
