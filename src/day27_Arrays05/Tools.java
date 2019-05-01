package day27_Arrays05;

public class Tools {

	public static void main(String[] args) {
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		
				for (String toolsStr: tools) {
					switch (toolsStr.toLowerCase()) {
					case "java":
						System.out.println("Java --> programming language");
						break;
					case "selenium":
						System.out.println("Selenium --> Test Automation");
						break;
					case "testng":
					case "junit":
						System.out.println("Unit Tests");
						break;
					case "cucumber":
						System.out.println("JUnit --> Unit Tests");
						break;
					case "git":
						System.out.println("Version control");
						break;
					case "maven":
						System.out.println("Building and execution for project");
						break;
						default:
							System.out.println("INVALID");
							break;
					}
					
				}
				
				
				
	}

}
