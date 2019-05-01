package day18_while_dowhile_loop;

public class StairCase {

	public static void main(String[] args) {
		String stairs="";
		int stars=0;
		
		while (stars<=8) {
			stairs=stairs+="*";
			System.out.println(stairs);
			stars++;
		}
		
		

	}

}
