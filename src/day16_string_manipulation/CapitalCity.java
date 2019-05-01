package day16_string_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		String str="Moscow is a capital of Russia";
		String str1=str.replace("Moscow", "Kyiv").replace("Russia", "Ukraine");
		System.out.println(str1);
		
		String email="firstName_LastName@gmail.com";
		String company="deloitte";
		String email1=email.replace("gmail", company);
		System.out.println(email1);

	}

}
