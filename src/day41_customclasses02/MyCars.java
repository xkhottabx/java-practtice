package day41_customclasses02;

public class MyCars {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.make="Ford";
		car1.model="Expedition";
		car1.color="Black";
		car1.currentSpeed=90;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(60);
		System.out.println(car1.currentSpeed);
		car1.accelerate(20);
		System.out.println(car1.currentSpeed);

		BMW bmw=new BMW();
		System.out.println(bmw.make);
		bmw.model="m3";
		bmw.showPrice();
		System.out.println("Price: "+bmw.price);
	
	
}	
}
