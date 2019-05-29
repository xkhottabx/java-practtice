package day46_static_keyword;

public class Vehicle {
String type;//instance variable, every object has its own type
static int numberOfVehicles;//shared, one central avenue


		public static void vehicleInfo() {
			/*
			System.out.println("type: "+type);//not static, will not compile, type is non-static
			*/
			System.out.println("Number of vehicles "+numberOfVehicles);
			int count=getNumberOfVehicles();
			/*
			System.out.println(toString()); - will not compile, cannot call non-static method
			*/
		}
		
		public static int getNumberOfVehicles() {
			return numberOfVehicles;
		}
		
		public String toString() {
			return "Vehicle type: "+type+ " | "+numberOfVehicles;
		}
}
