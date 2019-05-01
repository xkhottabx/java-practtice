package day36_wrapper_classes_arraylistintro;

public class WrapperClassMethods {

	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);//same for other primitives

		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println(Character.MIN_VALUE);//empty
		System.out.println(Character.MAX_VALUE);//?
		
		//convert string to primitive
		int count1=Integer.parseInt("23555");
		int count2=Integer.valueOf("14424");//returns a Wrapper class object (String->Integer)
		System.out.println(count1);
		System.out.println(count2);
		
		System.out.println(Character.isAlphabetic('a'));//boolean TRUE
		System.out.println(Character.isAlphabetic('1'));//FALSE (not a letter)
		System.out.println(Character.isAlphabetic('@'));//FALSE
		
		System.out.println(Character.isLetter('i'));//TRUE
		System.out.println(Character.isDigit('5'));//TRUE (from 0 to 9)
		
		String word="asd343faeer4r2dwf33";
		for (int i=0; i<word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				System.out.println(word.charAt(i));
			}
		}
		
	}

}
