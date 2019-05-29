package day50_inheritance03;

public class SearchEngine {
	public int search(String item) {
		System.out.println("searching for: "+item);
		int resultsCount=item.length();
		return resultsCount;
	}
	
	protected void search(String item, String item2) {
		System.out.println("searching for: "+item+", "+item2);
		int resultsCount=item.length()+item2.length();
		System.out.println(resultsCount); 
	}
	
	String clickResult() {
		System.out.println("fdfesf");
		return "erheh";
	}
	
	
}
