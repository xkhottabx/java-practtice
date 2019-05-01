package day23_nestedloop_arrays;

import java.util.Scanner;

public class BruteForce {
	public static void main(String[] args) {
		String expUserName="admin";
		String expPassword="admin123";
		int attempts=5;
		Scanner scan=new Scanner(System.in);
		String userName="";
		String password="";
		
		do {
			if (attempts--==0) {
				System.out.println("You have been terminated");
				return;
					}
			System.out.println("Please enter username");
			userName=scan.next();
			if (!userName.equals(expUserName)) {
				System.out.println("Wrong. Attempts left: "+attempts);
				continue;
							}
			System.out.println("Please enter password");
			password=scan.next();
			if (!password.equals(expPassword)) {
				System.out.println("Wrong. Attempts left: "+attempts);
				continue;
							}
		}while(!userName.equals(expUserName) || !password.equals(expPassword));
		System.out.println("Login successfull!");
	}
}
