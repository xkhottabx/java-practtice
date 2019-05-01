package day33_methods05_return;

public class PayCalculator {

	public static void main(String[] args) {
		int res=getHourlyPay(8,45);
		System.out.println(res);
		

	}
	
public static int getHourlyPay(int hours, int rate) {
	int result=hours*rate;
	if (hours<=0 || rate<=0) {
		System.out.println("Invalid data");
		return 0;
	}
	
	return result;
		

	}
	

}
