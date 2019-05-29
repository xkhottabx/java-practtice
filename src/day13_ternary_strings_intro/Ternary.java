package day13_ternary_strings_intro;

public class Ternary {

	public static void main(String[] args) {
		String result;
		int score=78;
		result=score>60 ? "pass": "fail";
		System.out.println("Result is "+result);
		
		int sum=77;
		boolean free=false;
		boolean isMember=true;
		
		free=sum>150 || (sum>75 && isMember==true)? true: false;  
		
System.out.println(free);
	}

}
