package day28_Arrays06;

public class FootballTeams {

	public static void main(String[] args) {
		String [][] teams=new String[2][6];
		teams[0][0]="Irina";
		teams[0][1]="Zarif";
		teams[0][2]="Cihan";
		teams[0][3]="Habib";
		teams[0][4]="Adel";
		teams[0][5]="Bojan";
		
		teams[1][0]="Olimjon";
		teams[1][1]="Mirshod";
		teams[1][2]="Usman";
		teams[1][3]="Nursultan";
		teams[1][4]="Roman";
		teams[1][5]="Dmitriy";
		
		System.out.println(teams[0][0]);
		
		//PRINT HOW MANY ROWS/TEAMS/ARRAYS
		
		System.out.println(teams.length);//2
		System.out.println(teams[0].length);//6
		

	}

}
