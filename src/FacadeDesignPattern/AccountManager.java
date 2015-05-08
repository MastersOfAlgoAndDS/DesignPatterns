package FacadeDesignPattern;

/**
 * @author Milind This class basically has the job to validate account
 */
public class AccountManager {
	String acctNumber;

	public AccountManager(String number) {
		acctNumber = number;
	}

	public boolean checkAccount() {
		if (acctNumber.equals("123456789"))
			return true;
		return false;
	}
}
