package day31_methods03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double firstNum=scan.nextDouble();
		double secondNum=scan.nextDouble();
		add(firstNum,secondNum);
		substract(firstNum,secondNum);
		multiply(firstNum,secondNum);
		divide(firstNum,secondNum);
		remainder(firstNum,secondNum);
	}
	
public static void add(double num1, double num2) {
	double result=num1+num2;
	System.out.println("Result: "+result);
		
	}

public static void substract(double num1, double num2) {
	double result=num1-num2;
	System.out.println("Result: "+result);
		
	}

public static void multiply(double num1, double num2) {
	double result=num1*num2;
	System.out.println("Result: "+result);
		
	}

public static void divide(double num1, double num2) {
	double result=num1/num2;
	System.out.println("Result: "+result);
		
	}

public static void remainder(double num1, double num2) {
	double result=num1%num2;
	System.out.println("Result: "+result);
		
	}

}
