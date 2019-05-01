package practice;

public class MergeWords {

	public static void main(String[] args) {
		String s=mergeStrings("RAYSEE","ban");
		System.out.println(s);
		String qw=uniqueChars("wooden");
System.out.println(qw);
	}
	
	
	 public static String mergeStrings(String one, String two) {
		    
		    String merged="";
		    int first=one.length();
		    int second=two.length();
		    
		    if (first==second){
		      for (int i=0; i<first; i++){
		        merged+=one.charAt(i)+""+two.charAt(i);
	
		      }
		    }
		    else if (first>second){
		      for (int i=0; i<second; i++){
	        merged+=one.charAt(i)+""+two.charAt(i);
		      }
		      merged+=one.substring(second, first);
		    }
		    else{
		      for (int i=0; i<first; i++){
		        merged+=one.charAt(i)+""+two.charAt(i);
		      }
		      merged+=two.substring(first, second);
		    }
		    return merged;
		  }
	 

	  public static String uniqueChars(String str) {
	    //TODO: write your below
		  String nChar="";
		  String letter="";
	    String unique=""+str.charAt(0);
	    for (int i=1; i<str.length(); i++){
	    	nChar=str.substring(i,str.length());
	    	letter=""+str.charAt(i);
	    	if (!nChar.contains(letter)) {
	    		unique+=letter;
	    	} 
	    }
	    
	    return unique;
	    
	  }
	 
	 
		}


