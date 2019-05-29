package day40_customclassesan_methods;

public class Employee {
	public String name, jobTitle;//can be used anywhere in project
	double salary;//can only be used in the same package
	
	public void work() {
		System.out.println(name+" is working hard...");
	}
	public void attendMeeting() {
		System.out.println(name+" is attending meeting...");
	}
	public void introduce() {
		System.out.println("Name[" + name +"], jobTitle[" + jobTitle 
				+"], salary[" + salary + "]");
	}
}
