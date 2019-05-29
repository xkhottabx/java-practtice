package day42_customclasses_encapsulation;
import java.util.*;
public class StringShoesToObject {
	public static void main(String[] args) {
		String data="Bruno magli,9.5";
		String[] arrData=data.split(",");
		
		Shoes shoes=new Shoes();
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());
		
		Scanner scan=new Scanner(System.in);
		String brand=scan.next();
		double size=scan.nextDouble();
		Shoes shoes2=new Shoes();
		shoes2.setShoesData(brand, size);
		System.out.println(shoes2.getShoesData());
	}
}
