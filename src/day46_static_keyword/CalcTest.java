package day46_static_keyword;

public class CalcTest {
		public static void main(String[] args) {
			double result=Calculator.plus(55, 7);//STATIC WAY
			System.out.println(result);
			
			result=Calculator.minus(44,14);
			System.out.println(result);
			
			Calculator c=new Calculator();
			System.out.println(c.multiply(4, 2));//you don't need to create object
			
			int i=Integer.parseInt("33");//utility static method
			System.out.println(Character.isDigit('5'));
		} 
}
