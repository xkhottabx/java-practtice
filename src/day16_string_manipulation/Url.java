package day16_string_manipulation;

import java.util.Scanner;

public class Url {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String url=scan.next();
		if (url.startsWith("www.") && url.lastIndexOf(".")==url.length()-4){
			System.out.println("Domain: "+url.substring(4,(url.length()-4)));
			System.out.println("Extension: "+url.substring(url.length()-3, url.length()));
		}else {
			System.out.println("INVALID");
		}
		

	}

}
