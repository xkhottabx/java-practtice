package day15_string_manipulations;

public class IndexOf {

	public static void main(String[] args) {
		String word1="github";
		System.out.println(word1.indexOf('g'));
		System.out.println(word1.indexOf("th"));//#2
		System.out.println(word1.indexOf("hub"));//#3
		System.out.println(word1.indexOf("java"));//#(-1) - automatically if it cannot find
		
		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("Position of dot: "+i);
		System.out.println(url.charAt(i+1));
		
		String title="Java - Google Search";
		int dash=title.indexOf("-");
		System.out.println(dash);
		if (title.charAt(dash-1)==' ' && title.charAt(dash+1)==' ') {
			System.out.println("Present");
		}
		else {
			System.out.println("Not present");
		}
		
		String country="United States of America";
		int states=country.indexOf("States");//position of "States"
		System.out.println(states);
		
		String word2="java, c++, python, tomcat, eclipse";
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		}
		else
		{
			System.out.println("not there");
		}
		
		//2) using IndexOf
		
		if (word2.indexOf("c++")>(-1)) {
			System.out.println("c++ is there");
		}
		else {
			System.out.println("not there");
		}
	}

}
