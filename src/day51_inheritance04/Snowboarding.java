package day51_inheritance04;

public class Snowboarding extends Exercise {

	public int perform(int minutes) {
		super.perform(10);//call super class version
		System.out.println("Doing snowboarding for min: "+minutes);
		return 7*minutes;
	}
}
