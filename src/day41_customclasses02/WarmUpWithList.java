package day41_customclasses02;
import java.util.*;
public class WarmUpWithList {
	public static List<Integer> doubleTheList(List<Integer> nums){
		for (int i=0; i<nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		}
		return nums;
	}
	
	public static void main(String[] args) {
		List<Integer>nums1=new ArrayList<>();
		nums1.add(4);
		nums1.add(3);
		
		System.out.println(doubleTheList(nums1));
	}
}
