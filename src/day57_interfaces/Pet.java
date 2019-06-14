package day57_interfaces;

public interface Pet {
	boolean FRIENDLY=true;
	
	public abstract void keepAsPet();
	
	public default void play() {System.out.println("Playing hide and seek");}
	public static void feed(String food) {System.out.println("Feeding a pet with "+food);}
}
