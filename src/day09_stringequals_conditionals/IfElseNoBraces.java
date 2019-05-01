package day09_stringequals_conditionals;

public class IfElseNoBraces {

	public static void main(String[] args) {
		String day="Tuesday";
		
		if (day.equals("Tuesday"))
			System.out.println("Right");
		else
			System.out.println("Wrong");
		System.out.println("Something");//in this case this line does not belong to ELSE block

	}

}
