package day27_Arrays05;

public class WebLink {

	public static void main(String[] args) {
		String web="https://learn.cybertekschool.com/courses/149";
		String[] webArr=web.split("/");
		int webA=Integer.parseInt(webArr[webArr.length-1]);
		switch (webA) {
		case 147:
			System.out.println("Java programming");
			break;
		case 204:
	System.out.println("Mentoring sessions");
	break;

		case 149:
	System.out.println("SDLC");
	break;

		case 144:
	System.out.println("Team activity");
	break;

		case 152:
	System.out.println("QA Testing");
	break;

		case 143:
	System.out.println("Welcome Kit");
	break;
	default:
		System.out.println("INVALID");
		break;

	}
	}

}
