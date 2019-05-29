package practice;

public class totalAmount {

	public static void main(String[] args) {
		double sum=100;
		double total=0;
		double discountByItemCount=5, discountByItemPrice=18;
		boolean isShippingFree=true;

		if (discountByItemCount>discountByItemPrice) {
			total+=sum*(1-(discountByItemCount/100));
		}
		else if (discountByItemPrice>discountByItemCount) {
				total+=sum*(1-(discountByItemPrice/100));
		}
		else   {
			total+=sum;
		}
		//total1=total;
		
		if (isShippingFree==false) {
			total+=13.5;
		}
System.out.println(total);
	}

}
