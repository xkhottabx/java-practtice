package day55_abstraction;

public class Zoo {
		public static void main(String[] args) {
			Animal cat=new Cat("Barsik");
			Cat cat1=new Cat("Murzik");
			cat.speak();
			cat1.speak();
		}
}
