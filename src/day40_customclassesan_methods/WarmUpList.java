package day40_customclassesan_methods;
import java.util.*;
public class WarmUpList {
		public static void main(String[] args) {
			ArrayList<String> str=new ArrayList<>();
			str.add("a");
			str.add("a");
			str.add("a");
			str.add("f");
			System.out.println(countOccurences(str, "a"));
			
			
	
}
		
		public static int countOccurences(ArrayList<String> words, String word) {
			int count=0;
			for (String w: words) {
				if (w.equals(word)) {
					count++;
				}
			}
			return count;
		}
		
		
		public static void removeAll(ArrayList<String> wordList, String targetWord){
			  for (String str: wordList){
			    if (str.equals(targetWord)){
			      wordList.remove(targetWord);    
			    }
			  }
			  
			}
}
