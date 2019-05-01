package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01 {

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
		if (operator.equalsIgnoreCase("+"))
		{
			result=n1+n2;
			//System.out.println(result);
		}
		else if (operator.equals("-"))
			
		{
			result=n1-n2;
			//System.out.println(result);
		}
		else if (operator.equals("*"))
		{
			result=n1*n2;
			//System.out.println(result);
		}
		else if (operator.equals("/"))
		{
			result=n1/n2;
			//System.out.println(result);
		}
		else if (operator.equals("%"))
		{
			result=n1%n2;
			//System.out.println(result);
		}
		else {
			System.out.println("INVALID INPUT");
			return; //DO NOT EXECUTE
		}
		
		System.out.println(result);
	}

}
