package day15_string_manipulations;

public class Contains {

	public static void main(String[] args) {
		String email="xkhottabx@gmail.com";
		System.out.println(email.contains("@"));
		
		String list="potatoes, apples, tomatoes, bread";
		System.out.println(list.contains("apples"));//true
		System.out.println(list.contains("oats"));//false
		System.out.println(list.contains("tomato"));//true
		
		boolean hasOats=list.contains("oats");
		System.out.println("Contains oats: "+hasOats);
		
		email="name@yahoo.com";
		if (email.contains("yahoo")) {
			System.out.println("YAHOO");
		}
		else {
			System.out.println("something else");
		}
		
	}

}
