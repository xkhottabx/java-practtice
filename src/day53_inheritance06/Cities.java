package day53_inheritance06;

public class Cities {
		public static void main(String[] args) {
			City baku=new City(123, "Baku");
			System.out.println(baku);
			City baku1=new City(123, "Baku");
			
			System.out.println(baku.equals(baku1)) ;
			
			System.out.println(baku.hashCode());//1552787810
			System.out.println(baku1.hashCode());//1361960727
			
			City city=new City(345, "London");
			Capital cap=new Capital(101, "Washington D.C.", 630000L); 
			
			
		System.out.println(city.count);	
		System.out.println(cap.count);	
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
			cap.displayCount();
			
			//call static methods
			City.buildARoad();
			Capital.buildARoad();
			//===========================================================
			
			City city2=new City(33345, "Fairfax");
			Capital cap2=new Capital(54352, "Bethesda", 64322L);
			
			city2.road();
			cap2.road();
			
		}
}
