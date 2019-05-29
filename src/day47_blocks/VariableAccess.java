package day47_blocks;

public class VariableAccess {
	int myInstanceVar=0;
		
	static int myStaticVar=55;
		
	public static void main(String[] args) {
		//System.out.println(myInstanceVar); - cannot access non-static from static method
		System.out.println(myStaticVar);
		
		//create object VariableAccess and print value
		VariableAccess var1=new VariableAccess();
		System.out.println(var1.myInstanceVar);
		System.out.println(var1.myStaticVar);
	}

}
