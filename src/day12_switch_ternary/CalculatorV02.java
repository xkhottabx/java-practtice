package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {

	public static void main(String[] args) {
		double n1, n2, result = 0;
		String operator;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		n1=scan.nextDouble();
		System.out.println("Enter second number");
		n2=scan.nextDouble();
		System.out.println("Select operation");
		operator=scan.next();
		
		switch(operator) {
		case "+":
			System.out.println(n1+n2);
			break;
		case "-":
			System.out.println(n1-n2);
			break;
		case "*":
			System.out.println(n1*n2);
			break;
		case "/":
			System.out.println(n1/n2);
			break;
		case "%":
			System.out.println(n1%n2);
			break;
			default:
				System.out.println("INVALID OPERATION");
		}

	}

}
