package day18_while_dowhile_loop;

import java.util.*;

public class GiveMe5Dollars {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int dollars=0;
		
		while (dollars!=5) {
			System.out.println("Give me $5");
			dollars=scan.nextInt();
			
		}
		System.out.println("THANK YOU");
	}

}
