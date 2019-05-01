package day11_logical_nestedif;

public class LogicalBooleanValues {

	public static void main(String[] args) {
		boolean b1=5>10 && 10>100;
		System.out.println("b1: "+b1);

		boolean b2='a'=='a' && 123>120;
		System.out.println("b2: "+b2);
		
		boolean b3=true && 10>=10 && 1000<=900;
		System.out.println("b3: "+b3);
		
		boolean b4=false && false && 10==10;
		System.out.println("b4: "+b4);
		
		boolean b5=false || true && 10==10;
		System.out.println("b5: "+b5);
		
		boolean b6=false && true || 10==10;
		System.out.println("b6: "+b6);
		
		boolean topicDone=true;
		boolean is3PM=true;
		boolean everythingIsClear=true||false;
		boolean Break=topicDone && is3PM && everythingIsClear;
		System.out.println("Break: "+Break);
		
		boolean b9=!(true || false) && true;
		System.out.println("b9: "+b9);
		
		boolean b10=!true||true && false;
		System.out.println("b10: "+b10);
		
		boolean b11=true;
		System.out.println(!!b11);
		
	}

}
