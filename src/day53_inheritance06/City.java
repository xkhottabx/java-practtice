package day53_inheritance06;

public class City {
	private int id;
	private String name;
	public int count=100;
	
	@Override
	public String toString() {
		return "id: "+id+" name: "+name+" count: "+count;
	}
	
	@Override
	public boolean equals(Object obj) {
		City c=(City) obj;
		if (this.id==c.id && this.name.equals(c.name)) {
			return true;
		}
		return false;
	}
	
	
	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id+name.length();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void buildARoad() {
		System.out.println("City - building road");
	}
	
	public void road() {
		 buildARoad();
	}
}
