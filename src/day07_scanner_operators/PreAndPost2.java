package day07_scanner_operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		int messages=10;
		messages++;//11
		++messages;//12
		System.out.println("Messages: "+messages);
		
		int readMessages=--messages;
		System.out.println("ReadMessages: "+readMessages);
		
		int unreadMessages=readMessages--;
		
		System.out.println("Unread messages:"+unreadMessages);
		System.out.println("readMessages: "+readMessages);
		
		int total=unreadMessages++ - readMessages--;
		
		
		
		int count=20;
		int count2=10;
		int totalCount=++count + --count2;
		
		int myCount=count++ + ++count;//21+23=44
		

	}

}
