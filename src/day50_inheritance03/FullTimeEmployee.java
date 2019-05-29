package day50_inheritance03;

public class FullTimeEmployee extends Employee {
	public void CalculatePay(int hours, double rate) {
		System.out.println("Employee total pay: "+(hours*rate)*1.05);
	}
}
