package day19_loops;

public class Palindrome {

	public static void main(String[] args) {
		String word="annA";
		String reversed = "";
		
		int idx=word.length()-1;
		while (idx>=0) {
				reversed=reversed+word.charAt(idx);
				idx--;
		}
System.out.println(reversed);
if (word.equalsIgnoreCase(reversed)) {
	System.out.println("Palindrome");
}
else {
	System.out.println("Not a palindrome");
}
	}

}
