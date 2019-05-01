package day31_methods03;

public class Authentication {

	public static void main(String[] args) {
		login("xkhottabx@gmail.com", "mentor001");
	}
	
	
//*****************************************************************************************************************
public static void login(String username, String password) {
		String validUsername="xkhottabx@gmail.com";
		String validPassword="mentor001";
		if (username.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("WELCOME");
		}
			else {
				System.out.println("INVALID");
			}
		
	}
	
	
}
