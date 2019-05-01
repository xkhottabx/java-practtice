package day07_scanner_operators;

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();

   if (num>0){
     
     System.out.println("positive");}
   
    else if (num==0) {
     System.out.println("0");
   } 
   else System.out.println("negative");
    
   

    
  }
}