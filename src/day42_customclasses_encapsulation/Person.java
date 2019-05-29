package day42_customclasses_encapsulation;

public class Person {
//declare name and age encapsulated data
	
	private String name;
	private int age;
	//public getter and setter methods for name
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		if (name.isEmpty())
			return;
		this.name=name;
	}
	
}
