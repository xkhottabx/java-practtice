package practice;

public class maxBlock {
	//https://codingbat.com/prob/p179479
	/*
	    maxBlock("hoopla") → 2
		maxBlock("abbCCCddBBBxx") → 3
		maxBlock("") → 0
	*/
	
	
	private String str;
	
	
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
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	} 
	
}
