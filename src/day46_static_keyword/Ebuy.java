package day46_static_keyword;

public class Ebuy {
	public static void main(String[] args) {
		Customer cm1=new Customer("Leonardo da Vinci", "leo_da_vinci@gmail.com");
		Customer cm2=new Customer("Tony Soprano", "soprano@gmail.com");
		Customer cm3=new Customer("John Joseph", "cro-mags@gmail.com");
		Customer cm4=new Customer("ozzy", "ozzy@gmail.com");
		System.out.println(Customer.count);//3
		cm1.count=10;
		System.out.println(cm3.count);//10
		System.out.println(Customer.count);//10
	}



}
