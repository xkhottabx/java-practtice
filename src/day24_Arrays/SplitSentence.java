package day24_Arrays;

public class SplitSentence {

	public static void main(String[] args) {
		String sentence="Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,"
				+ " and specifically designed to have as few implementation dependencies as possible.";
		String[] words=sentence.split(" ");
		int counter=words.length;
		for (String str: words) {
			System.out.print(str);
			//if (str.equalsIgnoreCase("language")) {
			//	break;
			//}
			counter--;
		}
		System.out.println("Position: "+counter);//position of word in String array
		System.out.println(words[0]);
		
		 int[] nums = {1,3,5,7,9};
		    int count=0;
		   for (int i=0; i<=nums.length; i++){
		    
		     if (i%2==0){
		      count=count;
		     }
		     else{
		      count++;
		     }
		   }
		    System.out.println(count);
		
		
	}

}
