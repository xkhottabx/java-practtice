package day25_Arrays03;

public class Population {

	public static void main(String[] args) {
		
		int[] population=new int[5];
		population[0]=5000;
		population[1]=10000;
		population[2]=7000;
		population[4]=8907;
		population[3]=4455;
		//if no value assigned, java will assigned 0 by default
		String str="abc";
		System.out.println(population[str.length()]);

		
		String[] cities= {"New York", "Washington D.C.", "Los Angeles", "Houston", "Minneapolis"};
		for (int i=0; i<cities.length; i++) {
			System.out.println(cities[i]+" population: "+population[i]);
		}
	}

}
