package day48_inheritance;
			//EMPLOYEE IS-A PERSON
public class Employee extends Person {
	String jobTitle;
	
	public void work() {System.out.println(name+" is working as "+jobTitle);}

	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
