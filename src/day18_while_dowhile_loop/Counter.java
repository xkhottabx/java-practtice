package day18_while_dowhile_loop;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		int num=1;
		while (num<=10) {
			System.out.print(num+", ");
			num++;
		Thread.sleep(1000);//pause the code execution for a second
		}
		
		int num2=11;
		while (num2>=0) {
		System.out.print(num2+", ");
			num2--;
		Thread.sleep(300);
			
			
			
			
		}

	}

}
