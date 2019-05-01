package day28_Arrays06;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		String [][] pizzas= {
				{"pineapple", "mushrooms"}, 
				{"olives", "pickles", "4 cheese"},
				{"onions"},
				{"pepper", "zuccini", "brocolli", "spinach"},
				{"cheese", "garlic", "tomato"}
				};
		
		
		for (String[] pizza:pizzas) {
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
		}
		
		//*************FOR LOOP***********************************
		
		for (int i=0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for (String topping: pizzas[2]) {
			System.out.println(topping);
		}
		
		int[][] students= {{4,5,6}, {12,5,7}, {23,55,12,55,3}};
		
		//2 parts: outer loop, inner loop
		//outer will take each group
		//inner loop will take each value/student id
		
		for (int[] group: students) {
			for (int studentId: group) {
				System.out.print(studentId+", ");
			}
			System.out.println();
		}
		
		int nums [][] = {
                {10,20},//0
                {10,30,40,50},//1
                {100,200,400},//2
                {555,333,111,444,666,78},//3
                
               };
			for (int i=0; i<nums.length; i++) {
				for (int j=0; j<nums[i].length; j++) {
					System.out.print(nums[i][j]+" ");
				}
				System.out.println();
			}





	}

}
