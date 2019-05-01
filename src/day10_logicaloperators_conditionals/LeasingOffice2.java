package day10_logicaloperators_conditionals;

import java.util.*;

public class LeasingOffice2 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Cybertek Apartments!");
    System.out.println("Number of bedrooms you are interested:");
    
    int[] numberOfBedrooms= {1,2,3};
    int[] startingPrice= {1100, 1850, 2550};
   // int numberOfBedrooms = scan.nextInt();
   
    int i=scan.nextInt();
    i--;
    
   // for (i=0; i<=2; i++) 
    if (i>=0 && i<=2) {
    	System.out.println(startingPrice[i]);
    }
    else {
    	System.out.println("Not available");
    }
    
    scan.close();
    
    
    
    
    
    
    
    
  }
}