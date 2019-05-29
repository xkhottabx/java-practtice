package day39_arraylist04;
import java.util.*;
public class UniqueValues {
	public static void main(String[] args) {
		List<Integer>nums=new ArrayList<>();
		nums.add(10);nums.add(10);nums.add(7);nums.add(8);nums.add(8);
		nums.add(3);nums.add(4);nums.add(8);
		
		List<Integer>uniqueNums=new ArrayList<>();
		List<Integer>uniqueNums2=new ArrayList<>();
		for (Integer num: nums) {
			if (!uniqueNums.contains(num)) {
				uniqueNums.add(num);
			}
		}
		
		System.out.println(nums);
		System.out.println(uniqueNums);//DISTINCT VALUES
		
		for (int i = 0; i < nums.size(); i++) {
			int count=0;
			Integer match=nums.get(i);
			for (int j = 0; j < nums.size(); j++) {
				if (nums.get(j)==match && i!=j) {
					count++;
					break;
				}
			}
			if (count==0) {
			uniqueNums2.add(match);
		}
		
		}
		System.out.println(uniqueNums2);
	}

}
