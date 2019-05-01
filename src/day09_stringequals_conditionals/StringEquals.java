package day09_stringequals_conditionals;

public class StringEquals {

	public static void main(String[] args) {
		String str1="Java";
		String str2="Java";
		System.out.println(str1==str2);//true
		System.out.println(str1=="Java");//true
		System.out.println(str2=="java");//false
		
		//equals method. PREFFERED WAY
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("java"));
		System.out.println(str2.equals("Java"));
		
		
		//String month="March";
		String month=new String("March");
		String month2=new String("March");
		
		System.out.println(month==month2);//Java is not doing values comparison. It is just checking if month and month are pointing to same memory
		System.out.println(month.equals(month2));//true
	}

}
