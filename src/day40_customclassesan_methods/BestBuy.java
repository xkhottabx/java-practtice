package day40_customclassesan_methods;

public class BestBuy {
	public static void main(String[] args) {
		//System.out.println(brand); - it will not work, we need object to use it
		
		CellPhone cell1=new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		cell1.brand="Nokia 6300";
		cell1.screenSize=2.0;
		cell1.color="silver";
		cell1.price=76.16;
		
		System.out.println("Brand: "+cell1.brand);
		
		CellPhone cell2=new CellPhone();
		cell2.brand="Siemens";
		cell2.screenSize=1.5;
		cell2.color="blue";
		cell2.price=32.23;
		System.out.println("### CALLING METHODS ###");
		cell1.call();
		cell1.message();
	}
}
