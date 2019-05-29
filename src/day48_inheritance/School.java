package day48_inheritance;

public class School {
	public static void main(String[] args) {
		Person person=new Person();
		Student student=new Student();
		
		person.name="Obama";
		person.age=57;
		person.gender='M';
		student.name="Donald";
		student.age=72;
		student.gender='M';
		person.eat("Vegan burger");
		student.eat("grechka");
		person.walk();
		person.sleep(8);
		student.sleep(4);
		
		Student student2=new Student();
		student2.name="Orhan";
		student2.age=40;
		student2.gender='M';
		student2.studentID=4040;
		student2.clazz="AGILE SCRUM";
		
		student2.code("Java");
		student2.attendClass();
		student2.eat("falafel");
		student2.walk();
		
		student.code("Java");
		student.attendClass();
	}
}
