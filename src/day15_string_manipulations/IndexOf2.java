package day15_string_manipulations;

public class IndexOf2 {

	public static void main(String[] args) {
		//index of with two inputs
		String list="html-selenium-angular-jenkins-grid";
		int firstDash=list.indexOf("html");
		int firstQDash=list.lastIndexOf("html");
		System.out.println("First dash: "+firstDash);
		System.out.println("Firdt dash: "+firstQDash);
		int secondDash=list.indexOf("-", 5);
		System.out.println("Second dash "+secondDash);
		int thirdDash=list.indexOf("-", secondDash+1);//+1
		System.out.println("Third dash: "+thirdDash);
		
		//find the last dash
		
		int lastDash=list.lastIndexOf("-");
		System.out.println("Last dash: "+lastDash);
		int p=12321;
		System.out.println(p/5);

	}

}
