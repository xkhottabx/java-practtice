package day13_ternary_strings_intro;

public class MoreTernary {

	public static void main(String[] args) {
		String quality="good";
		int rating=(quality.contentEquals("good")) ? 100: 0;
		System.out.println("Rating: "+rating);
		
		int PMhour=2;
		boolean rushHour;
		rushHour=(PMhour>=4 && PMhour<=7) ? true: false;
		System.out.println("rush hour "+rushHour);
		String result=(rushHour) ? "yes": "no";
		System.out.println("rush hour "+result);
		
		int AMhour=8;
		String amRushHour;
		amRushHour=(AMhour>=6 && AMhour<=9) ? "yes": "no";
		System.out.println(AMhour+" rush hour "+amRushHour);

	}

}
