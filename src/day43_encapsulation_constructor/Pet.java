package day43_encapsulation_constructor;

public class Pet {
private	String type, name;


public Pet(String type, String name) {
	this.type=type;
	this.name=name;
}
public Pet() {
	System.out.println("No-args constructors");
}
public void speak() {
	switch(type.toLowerCase()) {
	case "cat":
		System.out.println("Meow");
		break;
	case "dog":
		System.out.println("woo woo");
		break;
	case "bird":
		System.out.println("chik chirik");
		break;
	case "goat":
	case "sheep":
		System.out.println("beeeeeee");
		break;
		default:
			System.out.println("...");
	}
	
}

public String toString() {
	return "Pet [type=" + type + ", name=" + name + "]";
}

}
