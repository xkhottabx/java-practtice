package day05_operators;

public class CompanyWarmUp {

	public static void main(String[] args) {
		String companyName, address;
		int numberOfEmployees, revenue;
		boolean isTechCompany;
		companyName="Facebook";
		address="Silicon Valley, CA";
		numberOfEmployees=10000;
		revenue=4000000;
		isTechCompany=true;
		
		System.out.println("Company name is "+companyName);
		System.out.println("Address is "+address);
		System.out.println("Number of employees "+numberOfEmployees);
		System.out.println("The revenue is "+revenue);
		System.out.println("Is it tech Company? - "+isTechCompany);
		
		String aboutCompany;
		//aboutCompany="Company "+companyName+" which located in "+address+". Its "+numberOfEmployees+" blahblahblah"; - will not work
		aboutCompany="Company "+companyName+" which located in "+address+". Its "
		+numberOfEmployees+" blahblahblah"+" "+isTechCompany;
		System.out.println(aboutCompany);
		
		String greeting="Hi there";
		int n=greeting.length();
		System.out.println(n);

	}

}
