package day32_methods04_return;

public class MethodWithReturn {

	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i=giveMe10$();
		System.out.println(i);
		String name1=name();
		System.out.println(name1);
	}
	
public static int giveMe10$() {//THIS METHOD RETURNS INT VALUE
	return 10;
		
	}

public static String name() {
	return "Vlad";
		
	}


}
