package day38_arraylist03;
import java.util.*;
public class ContainsAll {

	public static void main(String[] args) {
		List<Integer> nums1=new ArrayList<>();
		nums1.add(10);nums1.add(20);nums1.add(30);nums1.add(40);
		
		List<Integer>nums2=new ArrayList<>();
		nums2.add(20);nums2.add(10);nums2.add(40);nums2.add(30);
		
		System.out.println(nums1.containsAll(nums2));//true
		
		nums2.add(50);
		
		System.out.println(nums1.containsAll(nums2));//false
		
		List<String> planA=new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");
		
		List<String> planB=new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("replit");
		
		System.out.println(planB.containsAll(planA) && planA.containsAll(planB));//true
		
	}

}
