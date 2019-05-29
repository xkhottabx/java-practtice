package day44_constructor02;

import java.util.*;

public class Dice {
	public static void main(String[] args) {
		Job job1=new Job();//call constr1
		Job job2=new Job("java developer");//call constr2
		Job job3=new Job("SDET", "Amazon", 130000.00);//call constr3
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		List<Job> jobList=new ArrayList<>();
		jobList.add(job3);
		jobList.add(new Job("Scrum Master", "Google", 123000));//with constr you can create it directly
		jobList.add(new Job("SDET", "FreddieMac", 100000));
		jobList.add(new Job("BA", "Leidos", 98000));
		jobList.add(new Job("Senior QA tester", "Delta", 150000));
		
		System.out.println(jobList);
		double max=Double.MIN_VALUE;
		int highestIndex=0;
		for (int i=0; i<jobList.size(); i++) {
			if (jobList.get(i).getAnnualSalary()>max) {
				max=jobList.get(i).getAnnualSalary();
				highestIndex=i;
			}
		}
		
				System.out.println("Highest salary: "+jobList.get(highestIndex));
		
		
		
	}
}
