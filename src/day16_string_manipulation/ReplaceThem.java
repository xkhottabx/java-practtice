package day16_string_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		String sentence="Coding is fun, it is my hobby!!";

		String withNoSpaces=sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		System.out.println(sentence.replace(",","!!!"));
		
		String mixed = "&^@#j$a-v|a@#$";
		mixed=mixed.replace("\"&^@#", "").replace("$", "");
		System.out.println(mixed);
		
		String result="About 95,000,000 results (0.54 seconds) ";
		
		System.out.println(result.replace("About ", "").replace(" results (", "").replace(" seconds)", ""));
		

	}

}
