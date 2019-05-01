package day25_Arrays03;

public class Shopping {

	public static void main(String[] args) {
		String[] products= {"Timberland", "H&M", "Rolex", "Gucci", "Nike"};
		double[] prices= {120.0, 5.99, 150.50, 3000, 6.99};
		int[] itemsID= {124, 14334, 1, 353, 3534};
		int total=0;
		
		for (int i=0; i<products.length; i++) {
			if (products.length==prices.length && products.length==itemsID.length) {
			System.out.println(itemsID[i]+"  "+products[i]+" "+prices[i]);
			total+=prices[i];
			
			}
			
			
		}
		System.out.println("total: "+total);
		double maxPrice=0;
		for (int i=0; i<prices.length; i++) {
			
			if (prices[i]>maxPrice) {
				maxPrice=prices[i];
			}
		}
		
		for (String product : products) {//FOR EACH LOOP
			System.out.println(product);
			
		}
		System.out.println(maxPrice);
	}

}
