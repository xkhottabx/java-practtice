package practice;
//https://codingbat.com/prob/p179479
//https://codingbat.com/prob/p121193

public class StringManipulations {
	
	public static int numBlock(String str) {
		 if (str.isEmpty()) {return 0;}
			int count=1, max=1;
			String temp=""+str.charAt(0);
			for (int i=1; i<str.length(); i++) {
				String ch=""+str.charAt(i);
				if (temp.contains(ch)) {
					temp+=ch;
					count++;
					if (count>max) {
					max=count;
				}
				}
				else {
					temp=""+ch;
					count=1;
				}
			}
			return max;
		
	}
	
	public static int sumOfNumbers(String str) {
		str=str+" ";
		
		int sum=0;
		  String temp="";
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
		    return sum;
	
	}
	
	
}
