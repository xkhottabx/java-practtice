package day08_casting_conditionals;

public class CastingPrimitives {

	public static void main(String[] args) {
		int i=(int) 3.4;
		double price=230.5;
		int dollars=(int)price;
		long longValue=345634l;
		int intValue=(int) longValue;
		System.out.println(intValue);
		int result=(int)(500.4/2.0);

	}

}
