package day47_blocks;

public class AllBlocks {
	int nonStaticInt=10;
	static int staticInt=10;
	
	static {
		System.out.println("STATIC BLOCK - I run first and only once");
		staticInt--;//just static
	}
	{
		System.out.println("INIT BLOCK - I run each time object is created.");
		nonStaticInt+=5;
		staticInt+=5;
				
	}
			
		public AllBlocks(){
			System.out.println("I run each time object is created");
			nonStaticInt+=3;
			staticInt+=3;
		}
}
