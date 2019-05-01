package day26_Arrays04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {

	public static void main(String[] args) {
		Random random=new Random();
		String[] names= {"James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
		
		System.out.println(names.length);
		System.out.println(Arrays.toString(names));
		//print 2 names in each column
		
		for (int i=0; i<names.length; i=i+2) {
			System.out.println(names[i]+", "+names[i+1]);
		}
		
		//print males names in one line with comma
		
		for (int i=0; i<names.length; i++) {
			if (i%2==0) {
			System.out.print(names[i]+", ");
			}
		}
		System.out.println();
//print random name from array names
		//use Random class
		int r=random.nextInt(names.length);
		System.out.println("Random name: "+names[r]);
		
		//PRINT all names that are up to 4 characters in uppercase in same line
		System.out.println();
		for (String name: names) {
		if (name.length()<=4) {
			System.out.print(name.toUpperCase()+", ");
		}
		}
		System.out.println("\nNAMES LENGTH SORT");
		
		String namesUpto4 = "";
        String names5to6 = "";
        String names7orMore = "";
        for (String name: names) {
        	if (name.length()<=4) {
        		namesUpto4 +=name+", ";
        	}
        	else if (name.length()>4 && name.length()<7) {
        		names5to6 +=name+", ";
        	}
        	else  {
        		names7orMore +=name+", ";
        		        	}
        
        }
        System.out.println(namesUpto4);
        System.out.println(names5to6);
        System.out.println(names7orMore);
        //SWAP MALE AND FEMALE
        System.out.println("\nNAMES SWITCH, LADIES FIRST");
        System.out.println(Arrays.toString(names));
        for (int i=0; i<names.length; i+=2) {
        	String temp="";
        	temp=names[i];
        	names[i]=names[i+1];
        	names[i+1]=temp;
        	
        }
        System.out.println(Arrays.toString(names));
	}

}
