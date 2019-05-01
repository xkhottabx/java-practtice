package day10_logicaloperators_conditionals;

public class IFStatementWithBooleanVariables {

	public static void main(String[] args) {
		boolean isBreakTime=true;
		if (isBreakTime==true) {
			System.out.println("Break");
		}
		else {
			System.out.println("No break");
		}
		
		//second version
		if (isBreakTime) {//it works with boolean
			System.out.println("Break");
		}
		else {
			System.out.println("No break");
		}

		//boolean qualified=true;
		//if (qualified==false) {
		//	System.out.println("Good luck");
		//}
		
		
	}

}
