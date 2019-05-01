package day36_wrapper_classes_arraylistintro;

public class Boxing {

	public static void main(String[] args) {
		//AUTOBOXING is converting from primitive to object
		Integer num1=1234;
		int n=5;
		Integer num2=n;
		
	//UNBOXING
		Double d1=new Double(34.2);
		double d2=d1;
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		
		long l1=new Long(6000000);//unboxing
		long l2=new Long(3454354343L);//no boxing
		long l3=l2;//auto-unboxing
		long l4=l3;//auto-boxing
		
		Integer num3=Integer.valueOf(345);

	}

}
