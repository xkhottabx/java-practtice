package day47_blocks;
import static day47_blocks.BriteERP.*;//static import. no need to call class

public class BriteERPLoginTest {
	public static void main(String[] args) {
		//calling static methods
				enterEmail();//without calling a class
		BriteERP.enterPassword();
		BriteERP.verifyLogin();
	}
}
