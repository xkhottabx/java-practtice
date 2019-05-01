package day18_while_dowhile_loop;

import java.util.Scanner;

public class PinCode2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	//	int secretPin=4321, pincode=0, attempts=0;
		
	//	while (pincode!=secretPin && attempts<=3) {
		//	System.out.println("Enter pin");
		//	pincode=scan.nextInt();
		//	attempts++;
	//	if (attempts==3 && pincode!=secretPin) {
		//	System.out.println("Card is blocked");
		//	return;
	//	}
		//}
		//*System.out.println("Access granted");
		
		
		String newGuest="", name1="", name2="";
		System.out.println("Please enter guest name:");
		name1=input.next();
	     System.out.println("Do you want to enter new guest name:");
	     newGuest=input.next();
		String list = "";
		
		
		while (newGuest.equals("yes")) {
			
		System.out.println("Please enter guest name:");
		name2=input.next();
		list+=name2+", ";
				
	     System.out.println("Do you want to enter new guest name:");
	     newGuest=input.next();
	     
	     
	     }
	     
	 
	    
	    System.out.println("Guest's list: "+name1+", "+list.substring(0, list.length()-2));

	}

}
