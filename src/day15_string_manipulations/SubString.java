package day15_string_manipulations;

public class SubString {

	public static void main(String[] args) {
		String sentence="Java string is fun";
		//System.out.println(sentence.substring(0, 4)); //print portion to char#4 (without 4)
		//System.out.println(sentence.substring(5, sentence.length()));
		String s="ja_va", s3;
		
		int g=s.indexOf("_")+1;
		String s1=s.substring(0, 1).toUpperCase();
		s3=s1+s.substring(1, g);
		int g1=s.indexOf("_")+1;
		String s4=s.substring(g1, g1+1).toUpperCase();
		
		//String s2=s.substring(g1, s.length());
	//	int dash=s.indexOf("_")+1;
		//String s2=s.substring(dash, dash+1).toUpperCase();
		//s=s1+s2;
		System.out.println(g1);
		System.out.println(s1);
		//System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
