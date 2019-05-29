package practice;

public class ReplIt195 {
	public static boolean isAnagram(String word1, String word2) {
	    boolean anagram=false;
	    word1=word1.replace(" ", "").toLowerCase();
	    word2=word2.replace(" ", "").toLowerCase();
	    int counter=0, num=0;
	    for (int i=0; i<word2.length(); i++){
	      String char2=""+word2.charAt(i);
	      
	      if (!word1.contains(char2)){
	        counter++;
	        break;
	      }
	       else{
	         num=word1.indexOf(char2);
	         word1=word1.substring(0, num)+word1.substring(num+1);
	         continue;
	       }
	    } 
	    return (counter==0?true:false);
	  }
	
	public static void main(String[] args) {
		System.out.println(isAnagram("silent", "listen"));
	}
}
