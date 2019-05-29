package practice;

public class SumofNumbers {
	public static void main(String[] args) {
		String str="dd100wg5iwenf10efef22";
		str=str+" ";
		
		int sum=0;
		  String temp="", temp2="";
		    for (int i=0; i<str.length(); i++){
		      char digit=str.charAt(i);
		    
	      if (Character.isDigit(digit)){
		        temp+=digit;
		        
		      }
		      else if(!Character.isDigit(digit) && !temp.isEmpty()) {
		    	  sum+=Integer.parseInt(temp);
		    	  temp="";
		    	 
		      }
		   
		}
		    System.out.println(sum);
		}
	}
	
	
		  

