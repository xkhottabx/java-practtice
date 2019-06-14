package day56_Abstraction02;

public abstract class Browser {
	 String name;
	 static int id;
	
	public Browser(String name, int id) {
		System.out.println("Creating browser");
		this.name=name;
		this.id=id;
	}
	public abstract void navigate(String url);
	public abstract void displayWebPage();
	public abstract boolean launch(String url);
	public void close() {
		System.out.println("EXIT");
	}
}
