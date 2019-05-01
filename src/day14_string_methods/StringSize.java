package day14_string_methods;

public class StringSize {

	public static void main(String[] args) {
		String str1="Good morning";
		if (str1.equals("Good Morning")) {
			System.out.println("Match");
		}
		else {
			System.out.println("Not match");
		}
		
		if (str1.equalsIgnoreCase("good morning")){
				System.out.println("Match - ignore case");
		}
		else {
			System.out.println("Not match - ignore case");
		}
		
		System.out.println(str1.toUpperCase());
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}
		else {
			System.out.println("Chained methods: not match");
		}
		
		//HOW MANY CHARACTERS IN THE STRING
		
		String myName="Vlad";
		int length=myName.length();
		System.out.println(myName.length());
		System.out.println("My name's length: "+length);
		
		//usernames must be exactly 8 characters
		
		String userName="xkhottabx";
		if (userName.length()==8) {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}
		
		
		
	}
	
	
}
