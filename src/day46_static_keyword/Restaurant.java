package day46_static_keyword;

public class Restaurant {
	public static void main(String[] args) {
		Dinner Mom=new Dinner();
		Dinner kid=new Dinner();
		Dinner Dad=new Dinner();
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		
	Dad.takeASlice();
	kid.takeASlice();
	Mom.takeASlice();
	
	
	System.out.println("Total slices: "+Dinner.pizzaSlices);//5
	System.out.println("Total slices: "+Dad.pizzaSlices);//5
	
	kid.takeASlice(3);
	Dad.takeASlice(2);

	
	System.out.println("Total slices: "+Dinner.pizzaSlices);
	}
	
}
