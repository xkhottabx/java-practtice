package day41_customclasses02;

public class Car {
String make, model, color;
int currentSpeed;

	public void printCarInfo() {
	System.out.println("Car Make " +make+" model "+model+" color "+color+" current speed "+currentSpeed);	
	}
	public void showCurrentSpeed (int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, following the speed limit -" + speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, over the speed limit -" + speedLimit);
		}
	}
	
	public void accelerate(int mph) {
		currentSpeed+=mph;
		
	}
		
}
