package day50_inheritance03;

public class Company {
	public static void main(String[] args) {
		Employee emp=new Employee();
		FullTimeEmployee ft=new FullTimeEmployee();
		Contractor ct=new Contractor();
		emp.CalculatePay(40, 40);
		ft.CalculatePay(40, 50);
		ct.CalculatePay(40, 55);
	}
}
