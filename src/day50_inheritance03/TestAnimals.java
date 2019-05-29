package day50_inheritance03;

public class TestAnimals {
		public static void main(String[] args) {
			Animal an=new Animal();
			Cat cat=new Cat();
			Dog dog=new Dog();
			Duck duck=new Duck();
			
			an.speak();
			cat.speak();
			dog.speak();
			duck.speak();
			
			an.move(2);
			cat.move(3);
			dog.move(4);
			duck.move(5);
			
		}
}
