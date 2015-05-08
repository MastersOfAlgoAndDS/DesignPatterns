package FacadeDesignPattern;

/**
 * @author Milind This class has the function to validate security code
 */
public class CodeManager {

	public static boolean checkSecurityCode(String code) {
		if (code.equals("1234"))
			return true;
		return false;
	}

}
