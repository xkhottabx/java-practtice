package day07_scanner_operators;

import java.util.Scanner;
public class ComparisonOperators {

	public static void main(String[] args) {
		//==, <, >, =!, <=, >=
		boolean m;
		String married, notmarried="false";
		Scanner scan=new Scanner(System.in);
		System.out.println(5==5);//true
		System.out.println(50==4);//false
		int searchCount=5000;
		System.out.println(searchCount==5000);//true
		
		int expectedCount=5010;
		System.out.println(searchCount==expectedCount);//false
		
		int speedLimit=55;
		int currentSpeed=75;
		System.out.println( currentSpeed==speedLimit);
		
		boolean atLimit=currentSpeed==speedLimit;
		System.out.println("Speed limit: "+atLimit);
		married=scan.next();
		
		m=married.contentEquals("true");
		System.out.println(m);
		
		
		

	}

}
