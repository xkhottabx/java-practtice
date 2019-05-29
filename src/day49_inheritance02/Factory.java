package day49_inheritance02;
//Factory is a non-Subclass that is in same package
public class Factory extends Device {
	public static void main(String[] args) {
		Device dv=new Device();
		dv.brand="LG";
		dv.model="Izh";
	}
}
