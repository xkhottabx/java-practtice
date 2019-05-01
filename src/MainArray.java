import day34_methods06_return.CountArray;
import java.util.*;
public class MainArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		int[] num2=CountArray.getArray();
		int [] num3=getRandomArray(50);
//		for(;;)//INFINITE LOOP 			WHILE (TRUE)
		System.out.println(Arrays.toString(num3));
		
	}
	
	public static int[] getRandomArray(int size) {
		Random r=new Random();
		int[] arr=new int[size];
		for (int i=0; i<size; i++) {
			arr[i]=r.nextInt(101);
		}
		return arr;
		
	}

}
