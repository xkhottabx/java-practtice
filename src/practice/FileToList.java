package practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class FileToList {
	public static void main(String[] args) throws FileNotFoundException {
		//create file object
		File file = new File("products.txt");
		//open file using scanner
		Scanner scan = new Scanner(file);

		ArrayList<String> data = new ArrayList<>();


		//hasNextLine will be true if there is a line of data
		while (scan.hasNextLine()) {
			//it reads line and switches to next line
			String line = scan.nextLine();
			System.out.println(line);
			data.add(line);
		}
		System.out.println(scan.hasNextLine());//false
		System.out.println(data);
	}

	public static String extractNum(String s) {
		String num = "";
		String nums = "0123456789";
//		    //String char="";
////		    for (int i=0; i<s.length(); i++){
////		       char=""+s.charAt(i);
////		      if (nums.contains(char)){
////		        num+=char+"";
////		      }
////		    }
////		   return num;
		return null;
	}
}