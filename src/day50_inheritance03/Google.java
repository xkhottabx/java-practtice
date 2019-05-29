package day50_inheritance03;

public class Google extends SearchEngine {
	@Override
	public int search(String item) {
		System.out.println("Google searching for: "+item);
		int resultsCount=item.length();
		return resultsCount;
	}
	
	public void search(String item, String item2) {
		System.out.println("searching for: "+item+", "+item2);
		int resultsCount=item.length()+item2.length();
		System.out.println(resultsCount); 
	}
	
	protected String clickResult() {
		System.out.println("fdfoesf");
		return "eroheh";
	}
}

