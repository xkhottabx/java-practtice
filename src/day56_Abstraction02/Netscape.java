package day56_Abstraction02;

public class Netscape extends Browser {

	public Netscape(String name, int id) {
		super(name, id);
		
	}

	@Override
	public void navigate(String url) {
		System.out.println("navigate to: "+url);
		
	}

	@Override
	public void displayWebPage() {
	System.out.println("Netscape - displaying webpage");	
		
	}

	@Override
	public boolean launch(String url) {
		System.out.println("Launching..."+url);
		return false;
	}

}
