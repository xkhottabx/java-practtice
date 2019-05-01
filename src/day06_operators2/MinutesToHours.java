package day06_operators2;

public class MinutesToHours {

	public static void main(String[] args) {
		int total=125;
		int hours, minutes;
		hours=total/60;
		total=total%60;
		minutes=total;
		
		System.out.println(hours+" "+minutes);
		

	}

}
