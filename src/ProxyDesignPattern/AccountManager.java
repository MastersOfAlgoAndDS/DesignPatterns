package ProxyDesignPattern;

public class AccountManager implements IAccountManager {

	@Override
	public void getRequest() {
		System.out.println("getRequest method in the main subject class");
	}

}
