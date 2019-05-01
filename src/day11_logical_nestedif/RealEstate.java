package day11_logical_nestedif;

import java.util.*;

public class RealEstate {

	public static void main(String[] args) {
		int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		String smoking, garage, houseType, backyard, singleFamilyHome;
		singleFamilyHome="Single Family Home";
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
		 System.out.println("Enter your property type:");
		    houseType=scan.nextLine();
				    if (houseType.equalsIgnoreCase("Condo"))
				    {
				      propertyPrice=50000;
				    }
				    if (houseType.equalsIgnoreCase("Townhouse"))
				    {
				      propertyPrice=75000;
				    }
				    if (houseType.equalsIgnoreCase(singleFamilyHome))
				    	//if (houseType.equals("Single Family Home"))
				    {
				      propertyPrice=95000;
				    }
				    
				     System.out.println("How many bedrooms do you have?");
				    numberOfBedrooms=scan.nextInt();
				    propertyPrice=propertyPrice+(numberOfBedrooms*30000);
				    
				    System.out.println("Do you have a backyard?");
				     backyard=scan.next();
				     if (backyard.equalsIgnoreCase("true") && !houseType.equalsIgnoreCase("Condo"))
				     {
				       propertyPrice=propertyPrice+5000;
				     }
				     if (houseType.equalsIgnoreCase("Condo"))
				     {
				       System.out.println("Backyard is not available for condo!");
				     }
				     
				      System.out.println("Do you have garage?");
				      garage=scan.next();
				    
				    if (garage.equalsIgnoreCase("true"))
				    {
				      System.out.println("How many spots?");
				      garageSpots=scan.nextInt();
				      if (garageSpots<=10)
				      {
				        propertyPrice=propertyPrice+(garageSpots*20000);
				      }else
				      {
				        System.out.println("Pardon, it's not a public parking!");
				      }
				    }
				    
				    	System.out.println("How close is metro station?");
				    	metroAccessibility=scan.nextFloat();
				    	if (metroAccessibility<1.0)
				    	{
				    		propertyPrice=propertyPrice+10000;
				    	}
				    	if (metroAccessibility>=1.0 && metroAccessibility<=3.0)
				    	{
				    		propertyPrice=propertyPrice+5000;
				    	}
				    	
				    	System.out.println("How close is highway?");
				    	highwayAccessibility=scan.nextFloat();
				    	if (highwayAccessibility<=1.0)
				    	{
				    		propertyPrice=propertyPrice+15000;
				    	}
				    	if (highwayAccessibility>1.0 && highwayAccessibility<=5.0)
				    	{
				    		propertyPrice=propertyPrice+8000;
				    	}
				    	if (highwayAccessibility>5.0 && highwayAccessibility<=20.0)
				    	{
				    		propertyPrice=propertyPrice+4000;
				    	}
				    	
				    	System.out.println("What's the rating of nearest school?");
				    	
				     
				    	  
				    	  schoolScore=scan.nextFloat();
				    	  if (schoolScore>=8.0 && schoolScore<=10)
				    	  {
				    		  propertyPrice=propertyPrice+45000;
				    	  }
				    	  if  (schoolScore<8.0 && schoolScore>=4)
				    	  {
				    		  propertyPrice=propertyPrice+20000;
				    	  }
				    	  else // pay attention
				    	  {
				    		  propertyPrice=propertyPrice+5000;
				    	  }
				    	  
				    	  System.out.println("Does any of your family members smoking?");
				    	  smoking=scan.next();
				    	  if (smoking.equalsIgnoreCase("true"))
				    	  {
				    		  propertyPrice=propertyPrice-5000;
				    	  }
				    	  
				    	  System.out.println("Market report has been generated.");
				    	  System.out.println("Your estimate market price is:  "+propertyPrice+"$");
				      }
				    }
				    

			
				    
				 