package practice;

import java.util.Arrays;

public class NumberOfOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[]items= {"q","w", "e", "t"};
		String[]order= {"cat", "coffee mug",  "cactus", "dog", "coffee mug"};
		String name="";
		String newStr="";
		
		
		int counter=0;
		int count=0;
		for (int i=0; i<order.length; i++) {
			name=order[i];
			for (int j=0; j<order.length; j++) {			//!(newStr.contains(order[j])
			if (name.equals(order[j]) && i!=j) {
				newStr+=order[i]+" ";
				counter++;
				break;
			}
			}
		}
		for (int i=0; i<order.length; i++) {
		if (newStr.contains(order[i])) {
			newStr=newStr.replace(order[i],"");
			count++;
		}
		}
	System.out.println(count);

	System.out.println(newStr);
	
	
		
	}

}
