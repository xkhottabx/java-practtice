package day19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random random=new Random();
		int i=0;
		int guessNumber=0;
		int secretNumber=random.nextInt(101);//give a number between 0 and 100  (5 ATTEMPTS)
		do {
			System.out.println("Guess a number");
			guessNumber=scan.nextInt();
			i++;
			
			if (guessNumber<secretNumber) {
				System.out.println("Too small");
			}
			else if (guessNumber>secretNumber) {
				System.out.println("Too big");
			}
			else {
				System.out.println("BINGO");
			}
			if (i==5 && !(guessNumber==secretNumber)) {
				System.out.println("You made 5 attempts. GAME OVER");
			}
		}while(!(guessNumber==secretNumber) && i<5);
		
		
	}

}
