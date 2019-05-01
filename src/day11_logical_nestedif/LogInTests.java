package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests {

	public static void main(String[] args) {
		String validusername="vlad", validpassword="spoon123";
		String username, password;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter username and password");
		username=scan.nextLine();
		password=scan.nextLine();
		if (username.equalsIgnoreCase(validusername) && password.equals(validpassword))
		{
			System.out.println("Welcome");
		}
		else if (!username.equalsIgnoreCase(validusername) && !password.equals(validpassword))
		{
			System.out.println("NO");
		}
		else if (!username.equalsIgnoreCase(validusername) && password.equals(validpassword))
		{
			System.out.println("Invalid user name");
		}
		else if (username.equalsIgnoreCase(validusername) && !password.equals(validpassword))
		{
			System.out.println("Invalid password");
		}
		else 
		{
			System.out.println("Something wrong");
		}
	}

}
