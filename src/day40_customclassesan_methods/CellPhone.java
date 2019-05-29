package day40_customclassesan_methods;

public class CellPhone {
String brand;
double screenSize;
String color;
double price;

	public void call() {//it is not static. it will assign itself to object
		System.out.println("Calling......");
	}
	public void message() {
		System.out.println("Sending text message......");
	}
	
}
