package day39_arraylist04;

public class School {
	public static void main(String[] args) {
	//create object from student class
		Student student=new Student();
		student.name="Vlad";
		student.age=31;
		student.subject="Java";
		
		System.out.println("Name: "+student.name);
		System.out.println("Age: "+student.age);
		System.out.println("Subject: "+student.subject);
		
		System.out.println();
		
		Student student2=new Student();
		student2.name="Varvara";
		student2.age=3;
		student2.subject="FUN";
		
		System.out.println("Name: "+student2.name);
		System.out.println("Age: "+student2.age);
		System.out.println("Subject: "+student2.subject);
}
}
