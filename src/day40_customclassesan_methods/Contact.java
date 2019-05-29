package day40_customclassesan_methods;

public class Contact {
String name, email, phoneNumber;

public void call() {
System.out.println("Calling "+name+" ....");
}

public void sendMessage() {
System.out.println("Text message "+name+" ....");
}

public void sendEmail() {
System.out.println("Email send "+name+" ....");
}


}
