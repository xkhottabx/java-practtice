package day20_forloop;

public class EvenorOddSamirChallenge {

	public static void main(String[] args) {
		int i=0;
		//int j=0;
		int sumOfOdds=0;
		int sumOfEvens=0;
		String sumOfEven="",sumOfOdd="";
		for (i=1; i<=100; i++) {
			if (i%2==0) {
				//System.out.print(i+" "+(i+1)+"\n");
				//sumOfOdds+=i;
				sumOfEven+=(i)+", ";
			}else {
			sumOfOdd+=i+", ";
			}
			
		}
		System.out.print(sumOfEven + ", ");
		System.out.println();
		System.out.print(sumOfOdd+ " ");
		System.out.println();
	//	System.out.println(sumOfOdds);
		//System.out.println(sumOfEvens);
		
	}

}
