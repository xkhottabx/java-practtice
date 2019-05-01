package day33_methods05_return;

public class calculateAge {

	public static void main(String[] args) {
		System.out.println(ageCalc(1995));//WILL PRINT "YOUNGSTER" AND AGE
		ageCalc(1987);//WILL PRINT JUST "ADULT"
	}
	
public static int ageCalc(int years) {
	int age=2019-years;
	if (age>=1 && age<=14) {
	System.out.println("child");	
	}
	else if (age>=15 && age<=25) {
		System.out.println("youngster");
		}
	else if (age>=26 && age<=64) {
		System.out.println("adult");
		}
	else if (age>=65) {
		System.out.println("seniour");
		}
	else {
		System.out.println("Invalid age");
		return 0;//will not run the rest of the code (I had to put it as a first IF statement)
	}
		return age;
	}

}
