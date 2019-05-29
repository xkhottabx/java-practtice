package day40_customclassesan_methods;

public class MyContacts {
	public static void main(String[] args) {
		//create Contact object
		Contact contact1=new Contact();
		contact1.name="Varvara";
		contact1.phoneNumber="(202)333-4444";
		contact1.email="Varya@spacex.com";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
	}
}
