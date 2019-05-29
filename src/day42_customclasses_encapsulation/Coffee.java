package day42_customclasses_encapsulation;

public class Coffee {
String name, size;
double price;
int calories;


public void getCoffeeInfo() {
	System.out.println("Item: "+name.toUpperCase()+" Size: "+size+" Price: $"+price+" Calories: "+calories);
}

public void setName(String newName) {
	name=newName;
}

public void setSize(String newSize) {
	if (newSize.equalsIgnoreCase("TALL")|| newSize.equalsIgnoreCase("grande") || newSize.equalsIgnoreCase("Venti")) {
	size=newSize;
	}
	else {
		System.out.println("ERROR: Invalid size "+newSize);
		size="Unknown";
	}
}

public void setPrice(double newPrice) {
	price=newPrice;
}

public void setCalories(int newCalories) {
	calories=newCalories;
}

public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
	name=newName;
	calories=newCal;
	price=newPrice;
	setSize(newSize);
}



}
