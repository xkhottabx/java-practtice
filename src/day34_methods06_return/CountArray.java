package day34_methods06_return;

public class CountArray {

public static int findOccurences(int[] array, int value) {
	int num=0;
	for (int i=0; i<array.length; i++) {
		if (array[i]==value) {
			num++;
		}
	}
	
	return num;
		
	}

public static int[] getArray() {
	int[]newArr= {10,4,23,54,33};
	
	return newArr;
	
	
}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4};
		int q=findOccurences(arr, 4);
		System.out.println(q);
		
		int num1=findOccurences(new int[] {10,20,3,4,5,20}, 20);//CREATE ARRAY AND PASS TO METHOD
		System.out.println(num1);
		
		
		

	}

}
